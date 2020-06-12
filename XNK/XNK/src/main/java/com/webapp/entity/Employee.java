package com.webapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "employee")
public class Employee {
	
	@Id
	private String idEmployee;
	private String fullName;
	private String phone;
	
	@OneToMany(mappedBy="employee",fetch = FetchType.LAZY)
	private List<ExportForm> exportForm;
	
	public Employee() {}

	public Employee(String idEmployee, String fullName, String phone, List<ExportForm> exportForm) {
		super();
		this.idEmployee = idEmployee;
		this.fullName = fullName;
		this.phone = phone;
		this.exportForm = exportForm;
	}

	public String getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<ExportForm> getExportForm() {
		return exportForm;
	}

	public void setExportForm(List<ExportForm> exportForm) {
		this.exportForm = exportForm;
	}
	
}
