package com.training.main;

import java.util.Date;

import org.hibernate.Session;

import com.training.model.Employee;
import com.training.model.EmployeeDetails;
import com.training.util.HibernateUtil;

public class HibernateOtoOAnnotation_Main {

	public static void main(String[] args) 
	{
		Employee emp=new Employee(7, "kumar", "male", 26, "Married", "Pollachi",3,3,2,641005,new Date(System.currentTimeMillis()));
		EmployeeDetails empdet=new EmployeeDetails("Dancing,Music","165478",new Date(System.currentTimeMillis()));
		Session session=HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(emp);
		empdet.setEmployee(emp);
		emp.setEmployeedetails(empdet);
		session.persist(empdet);
		session.getTransaction().commit();
		HibernateUtil.getSessionAnnotationFactory().close();
		System.out.println("one to one Successsfully finished");
	}
}