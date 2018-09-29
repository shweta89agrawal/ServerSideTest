package org.sainsburys.retail.sprinbootstarter.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.sainsburys.retail.sprinbootstarter.model.Product;
import org.sainsburys.retail.sprinbootstarter.service.ProductService;
import org.springframework.stereotype.Service;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {
	
	

	public List<Product> getAllProducts() {
		List<Product> listofProducts = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setTitle("Sainsbury's Strawberries 400g");
		p1.setUnit_price(1.75);
		p1.setKcal_per_100g(33);
		p1.setDescription("by Sainsbury's strawberries");
		listofProducts.add(p1);
		return listofProducts;
	}

}
