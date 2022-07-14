package com.skillstorm.hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.skillstorm.beans.Artist;

public class ArtistDAO {

	public Artist findById(int id){
		Session session = HelloHibernate.SESSION_FACTORY.openSession();
		Artist object = (Artist) session.get(Artist.class, id); // 
		return object;
	}

	// after the save, the artist has a generated Id  (HQL + "userinput")
	public Artist save(Artist artist) {
		Session session = HelloHibernate.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();
		session.save(artist);
		tx.commit();
		return artist; // (SQLException) (rethrow as RuntimeException)
	}
	
}
