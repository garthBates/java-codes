package com.skillstorm.data;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.skillstorm.models.Product;

public class FakeProductDAO {
	List<Product> data = new CopyOnWriteArrayList<>(); // write (ConcurrentModificationException)
	public List<Product> findAll(){
		return data;
	}
	public void add(Product product) {
		data.add(product);
	}
}
