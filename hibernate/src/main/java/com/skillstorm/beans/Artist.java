package com.skillstorm.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {

	@Id
	private int artistId;
	private String name;

	public Artist() {
		super();
	}

	public Artist(String name) {
		super();
		this.name = name;
	}

	public Artist(int artistId, String name) {
		super();
		this.artistId = artistId;
		this.name = name;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", name=" + name + "]";
	}

}
