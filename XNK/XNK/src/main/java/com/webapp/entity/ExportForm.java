package com.webapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "exportform")
public class ExportForm {
	@Id
	private String id;

	@Column(name = "exportdate")
	private Date exportDate;

	@Column(name = "idgood")
	private String idGoodExport;

	@Column(name = "idcustomer")
	private String idCustomer;

	@Column(name = "idemployee")
	private String idEmployee;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idemployee",insertable = false,updatable = false)
	private Employee employee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idgood",insertable = false,updatable = false)
	private Good good;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idcustomer",insertable = false,updatable = false)
	private Customer customer;
	
	public ExportForm() {}

	public ExportForm(String id, Date exportDate, String idGoodExport, String idCustomer, String idEmployee,
			Employee employee, Good good, Customer customer) {
		super();
		this.id = id;
		this.exportDate = exportDate;
		this.idGoodExport = idGoodExport;
		this.idCustomer = idCustomer;
		this.idEmployee = idEmployee;
		this.employee = employee;
		this.good = good;
		this.customer = customer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getExportDate() {
		return exportDate;
	}

	public void setExportDate(Date exportDate) {
		this.exportDate = exportDate;
	}

	public String getIdGoodExport() {
		return idGoodExport;
	}

	public void setIdGoodExport(String idGoodExport) {
		this.idGoodExport = idGoodExport;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
