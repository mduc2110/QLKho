package com.webapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Supplier;

@Repository
@Transactional
public class SupplierRepositoryImpl implements SupplierRepository{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Supplier> findAll() {
		Session s = sessionFactory.getCurrentSession();
        try {
            return s.createQuery("from supplier", Supplier.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	public Supplier findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		try {
			return session.get(Supplier.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean insert(Supplier supplier) {
		Session s = sessionFactory.getCurrentSession();
        try {
            s.save(supplier);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
	}

	public boolean delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		try {
			Supplier supplier = session.byId(Supplier.class).load(id);
			session.delete(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(Supplier supplier) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.update(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
