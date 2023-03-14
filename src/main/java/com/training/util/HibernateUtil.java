package com.training.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.training.model.Employee;
import com.training.model.EmployeeDetails;

public class HibernateUtil 
{
	private static SessionFactory sessionAnnotationFactory;

	private static SessionFactory buildsessionAnnotationFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("Hibernate-annotation.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(EmployeeDetails.class);
		
		System.out.println("hibernate configuration loaded successfully");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

	public static SessionFactory getSessionAnnotationFactory() {
		if (sessionAnnotationFactory == null)
		{
			sessionAnnotationFactory=buildsessionAnnotationFactory();
		}
		return sessionAnnotationFactory;
	}

}
