package com.websql.demo.service;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.websql.demo.entity.Product;
import com.websql.demo.repositoty.ProductRepository;
@Service("productService")
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> findAll() 
	{
		Iterable<Product> getProducts= productRepository.findAll();
		return getProducts;
	}

}
