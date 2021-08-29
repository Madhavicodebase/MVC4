package com.websql.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websql.demo.entity.Product;
import com.websql.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	private ProductService productService;
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) 
	{
		Iterable<Product> list=productService.findAll();
		modelMap.put("products",list);
		return "product/index";
	}
}

    
    