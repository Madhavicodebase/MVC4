package com.websql.demo.repositoty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.websql.demo.entity.Product;
@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer>
{

}
