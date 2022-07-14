package com.skillstorm.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloHibernate {

	public static void main(String[] args) {
		// create the session factory
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
}
