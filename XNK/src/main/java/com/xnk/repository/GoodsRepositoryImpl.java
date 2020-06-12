/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnk.repository;

import com.xnk.entity.Goods;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class GoodsRepositoryImpl implements GoodsRepository {

    @Autowired
    SessionFactory sessionFactory;

    public List<Goods> findAll() {
        Session s = sessionFactory.getCurrentSession();
        try {
            return s.createQuery("from goods", Goods.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Goods findById(String id) {
        Session s = sessionFactory.getCurrentSession();
        try {
            return s.get(Goods.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert(Goods goods) {
        Session s = sessionFactory.getCurrentSession();
        try {
            s.save(goods);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String id) {
        Session s = sessionFactory.getCurrentSession();
        try {
            Goods g = s.byId(Goods.class).load(id);
            s.delete(g);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Goods goods) {
        Session s = sessionFactory.getCurrentSession();
        try {
            s.update(goods);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}

