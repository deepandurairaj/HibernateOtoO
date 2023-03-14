package com.training.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="employee_generator")
	@SequenceGenerator(name="employee_generator",
	sequenceName="employee_seq",allocationSize=1)*/
	@Column(name="id")
	private int id;
	
	@Column(name="name")	
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@Column(name="address")
	private String address;

	@Column(name="city")
	private int city;
	
	@Column(name="designation")
	private int designation;
	
	@Column(name="department")
	private int department;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="updated_on")
	private Date updatedOn;
	
	@OneToOne(mappedBy="employee")
	private EmployeeDetails employeedetails;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}

	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}

	public Employee(int id, String name, String gender, int age, String maritalStatus, String address, int city,
			int designation, int department, int pincode, Date updatedOn) {
		
		this.id=id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.address = address;
		this.city = city;
		this.designation = designation;
		this.department = department;
		this.pincode = pincode;
		this.updatedOn = updatedOn;
	}
	
	
}
