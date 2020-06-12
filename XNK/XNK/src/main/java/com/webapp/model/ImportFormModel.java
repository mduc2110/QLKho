package com.webapp.model;

import java.util.Date;

import com.webapp.entity.Good;
import com.webapp.entity.Supplier;

public class ImportFormModel {
	
	private String id;
	
	private Date importDate;
	
	private String idGoodImport;
	
	private String idSupplier;
	
	private Good good;
	private Supplier supplier;

	public ImportFormModel() {}

	public ImportFormModel(String id, Date importDate, String idGoodImport, String idSupplier, Good good,
			Supplier supplier) {
		super();
		this.id = id;
		this.importDate = importDate;
		this.idGoodImport = idGoodImport;
		this.idSupplier = idSupplier;
		this.good = good;
		this.supplier = supplier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getImportDate() {
		return importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}

	public String getIdGoodImport() {
		return idGoodImport;
	}

	public void setIdGoodImport(String idGoodImport) {
		this.idGoodImport = idGoodImport;
	}

	public String getIdSupplier() {
		return idSupplier;
	}

	public void setIdSupplier(String idSupplier) {
		this.idSupplier = idSupplier;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
