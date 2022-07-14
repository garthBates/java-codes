package com.skillstorm.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.skillstorm.beans.Artist;

public class HelloHibernate {
	
	// SessionFactory MUST be a singleton
	public static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		dao.save(new Artist("Bear Family Revival"));
		System.out.println("Da bears");
	}
	
}
