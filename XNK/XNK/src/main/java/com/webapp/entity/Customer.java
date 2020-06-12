package com.webapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="customer")
public class Customer {
	
	@Id
	private String id;
	
	private String name;
	private String numberphone;
	private String country;
	
	@OneToMany(mappedBy="customer",fetch = FetchType.LAZY)
	private List<ExportForm> exportForm;
	
	public Customer() {}

	public Customer(String id, String name, String numberphone, String country, List<ExportForm> exportForm) {
		super();
		this.id = id;
		this.name = name;
		this.numberphone = numberphone;
		this.country = country;
		this.exportForm = exportForm;
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

	public List<ExportForm> getExportForm() {
		return exportForm;
	}

	public void setExportForm(List<ExportForm> exportForm) {
		this.exportForm = exportForm;
	}
	
}
