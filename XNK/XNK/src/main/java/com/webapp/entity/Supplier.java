package com.webapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="supplier")
public class Supplier {
	
	@Id
	private String id;
	
	private String name;
	private String numberphone;
	
	@OneToMany(mappedBy="supplier",fetch = FetchType.LAZY)
    private List<ImportForm> importForm;
	
	public Supplier() {}
	
	public Supplier(String id, String name, String numberphone, List<ImportForm> importForm) {
		super();
		this.id = id;
		this.name = name;
		this.numberphone = numberphone;
		this.importForm = importForm;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberphone() {
		return numberphone;
	}
	public void setNumberphone(String numberphone) {
		this.numberphone = numberphone;
	}

	public List<ImportForm> getImportForm() {
		return importForm;
	}

	public void setImportForm(List<ImportForm> importForm) {
		this.importForm = importForm;
	}
	
}
