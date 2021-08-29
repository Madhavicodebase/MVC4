package com.websql.demo.service;
//import java.util.List;
import com.websql.demo.entity.Product;

public interface ProductService 
{
	public Iterable<Product> findAll();
}

