package com.skillstorm.data;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.skillstorm.models.Product;

public class FakeProductDAO {

	public FakeProductDAO(){
		data.add(new Product(1, "Dan1", 10));
		data.add(new Product(2, "Dan2", 20));
		data.add(new Product(3, "Dan3", 30));
		data.add(new Product(4, "Dan4", 40));
	}
	
	List<Product> data = new CopyOnWriteArrayList<>(); // write (ConcurrentModificationException)
	public List<Product> findAll(){
		return data;
	}
	public void add(Product product) {
		data.add(product);
	}
}
