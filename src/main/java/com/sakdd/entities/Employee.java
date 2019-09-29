package com.sakdd.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "department")
	private String department;

	// CasCadeType.ALL - Saves the Child info while saving the Parent info
	// inversJoinColumns - child table's column / columns
	@OneToMany(targetEntity=Address.class, cascade=CascadeType.ALL)
	@JoinTable(name="employee_address", joinColumns = @JoinColumn(name="employee_id"), inverseJoinColumns = @JoinColumn(name="address_id"))
	private List<Address> addressList = new ArrayList<Address>();

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public Employee(Integer employeeId, String employeeName, String gender, String department,
			List<Address> addressList) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.department = department;
		this.addressList = addressList;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
