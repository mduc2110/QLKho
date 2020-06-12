package com.webapp.model;

import javax.validation.constraints.NotEmpty;

public class SupplierModel {
	
	@NotEmpty(message="ID khong duoc bo trong")
	private String id;
	
	@NotEmpty(message="Ten khong duoc bo trong")
	private String name;
	
	private String numberphone;
	
	public SupplierModel() {}
	
	public SupplierModel(String id, String name, String numberphone) {
		super();
		this.id = id;
		this.name = name;
		this.numberphone = numberphone;
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
	
}
