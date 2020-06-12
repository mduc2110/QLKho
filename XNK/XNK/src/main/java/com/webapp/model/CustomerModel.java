package com.webapp.model;

import javax.validation.constraints.NotEmpty;

public class CustomerModel {
	
	@NotEmpty(message = "id khong duoc bo trong")
	private String id;
	
	@NotEmpty(message = "ten khong duoc bo trong")
	private String name;
	
	private String numberphone;
	private String country;
	
	public CustomerModel() {}
	
	public CustomerModel(String id, String name, String numberphone, String country) {
		super();
		this.id = id;
		this.name = name;
		this.numberphone = numberphone;
		this.country = country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
