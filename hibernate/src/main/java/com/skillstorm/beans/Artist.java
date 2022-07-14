package com.skillstorm.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // manage this entity (keep the mapping in memory)
@Table(name="Artist")
public class Artist {

	@Id // Primary Key
	@Column(name="ArtistId") // use the Java property as the database column name
	@GeneratedValue(strategy = GenerationType.IDENTITY) // PK is generated by the database (stmt.getGeneratedKeys)
	private int id;
	
	@Column(name="Name")
	private String name;

	public Artist() {
		super();
	}
	
///////////////////////////
	public Artist(String name) {
		super();
		this.name = name;
	}

	public Artist(int artistId, String name) {
		super();
		this.id = artistId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int artistId) {
		this.id = artistId;
	}
///////////////////////////
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + id + ", name=" + name + "]";
	}

}
