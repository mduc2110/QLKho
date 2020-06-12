package com.webapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="importform")
public class ImportForm {
	@Id
	private String id;
	
	@Column(name="importdate")
	private Date importDate;
	
	@Column(name="idgood")
	private String idGoodImport;
	
	@Column(name="idsupplier")
	private String idSupplier;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idgood",insertable = false,updatable = false)
	private Good good;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idsupplier",insertable = false,updatable = false)
	private Supplier supplier;
	
	public ImportForm() {}

	public ImportForm(String id, Date importDate, String idGoodImport, String idSupplier, com.webapp.entity.Good good,
			com.webapp.entity.Supplier supplier) {
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
