package com.training.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")
public class EmployeeDetails {

	@Id
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="passport_num")
	private String passportNumber;
	
	@Column(name="passport_exp")
	private Date passportExpiry;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id")
	@MapsId
	private Employee employee;
	
	public EmployeeDetails() {
		
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public EmployeeDetails(String hobby,String passportNum,Date passportExp) {
		this.hobby = hobby;
		this.passportNumber=passportNum;
		this.passportExpiry=passportExp;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getPassportExpiry() {
		return passportExpiry;
	}

	public void setPassportExpiry(Date passportExpiry) {
		this.passportExpiry = passportExpiry;
	}

	
}
