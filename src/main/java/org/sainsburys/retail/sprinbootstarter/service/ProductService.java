package org.sainsburys.retail.sprinbootstarter.service;

import java.util.List;

import org.sainsburys.retail.sprinbootstarter.model.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
	
	public List<Product> getAllProducts();

}
