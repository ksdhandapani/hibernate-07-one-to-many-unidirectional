package com.sakdd.dtos;

import java.util.ArrayList;
import java.util.List;

import com.sakdd.entities.Address;

public class EmployeeVO {
	private Integer employeeId;
	private String employeeName;
	private String gender;
	private String department;
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
	public EmployeeVO(Integer employeeId, String employeeName, String gender, String department,
			List<Address> addressList) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.department = department;
		this.addressList = addressList;
	}
	public EmployeeVO() {
		super();
		// TODO Auto-genersated constructor stub
	}


	
}
