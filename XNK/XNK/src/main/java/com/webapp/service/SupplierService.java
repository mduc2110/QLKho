package com.webapp.service;

import java.util.List;

import com.webapp.entity.Supplier;
import com.webapp.model.SupplierModel;

public interface SupplierService {
	public List<Supplier> findAll();
	public Supplier findById(String id);
	public boolean insert(SupplierModel supplierModel);
	public boolean delete(String id);
	public boolean update(SupplierModel supplierModel);
}
