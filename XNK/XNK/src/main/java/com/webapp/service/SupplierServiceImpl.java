package com.webapp.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Supplier;
import com.webapp.model.SupplierModel;
import com.webapp.repository.SupplierRepository;

@Service
@Transactional 
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	SupplierRepository sRep;

	public List<Supplier> findAll() {
		return sRep.findAll();
	}

	public Supplier findById(String id) {
		return sRep.findById(id);
	}

	public boolean insert(SupplierModel supplierModel) {
		try {
			Supplier sup = new Supplier();
			sup.setId(supplierModel.getId());
			sup.setName(supplierModel.getName());
			sup.setNumberphone(supplierModel.getNumberphone());
			return sRep.insert(sup);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(String id) {
		return sRep.delete(id);
	}

	public boolean update(SupplierModel supplierModel) {
		try {
			Supplier sup = sRep.findById(supplierModel.getId());
			sup.setName(supplierModel.getName());
			sup.setNumberphone(supplierModel.getNumberphone());
			return sRep.insert(sup);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
