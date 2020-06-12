/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.repository;

import com.webapp.entity.Good;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class GoodRepositoryImpl implements GoodRepository {

    @Autowired
    SessionFactory sessionFactory;

    public List<Good> findAll() {
        Session s = sessionFactory.getCurrentSession();
        try {
            return s.createQuery("from good", Good.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Good findById(String id) {
        Session s = sessionFactory.getCurrentSession();
        try {
            return s.get(Good.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert(Good good) {
        Session s = sessionFactory.getCurrentSession();
        try {
            s.save(good);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String id) {
        Session s = sessionFactory.getCurrentSession();
        try {
            Good g = s.byId(Good.class).load(id);
            s.delete(g);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Good good) {
        Session s = sessionFactory.getCurrentSession();
        try {
            s.update(good);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
