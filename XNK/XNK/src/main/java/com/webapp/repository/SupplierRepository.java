package com.webapp.repository;
import java.util.List;

import com.webapp.entity.Supplier;

public interface SupplierRepository {
	List<Supplier> findAll();
	Supplier findById(String id);
	boolean insert(Supplier supplier);
    boolean delete(String id);
    boolean update(Supplier supplier);
}
