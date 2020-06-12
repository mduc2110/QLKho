package com.webapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Customer;

@Repository
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository{
	
	@Autowired
    SessionFactory sessionFactory;
	
	public List<Customer> findAll() {
		Session s = sessionFactory.getCurrentSession();
        try {
            return s.createQuery("from customer", Customer.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	public Customer findById(String id) {
		Session s = sessionFactory.getCurrentSession();
        try {
            return s.get(Customer.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	public boolean insert(Customer customer) {
		Session s = sessionFactory.getCurrentSession();
        try {
            s.save(customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
	}

	public boolean delete(String id) {
		Session s = sessionFactory.getCurrentSession();
        try {
            Customer c = s.byId(Customer.class).load(id);
            s.delete(c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
	}

	public boolean update(Customer customer) {
		Session s = sessionFactory.getCurrentSession();
        try {
            s.update(customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
	}

}
