package org.sainsburys.retail.sprinbootstarter.dao;

import java.util.List;

import org.sainsburys.retail.sprinbootstarter.model.Product;

public interface ProductDetailsDAO {
	
	public List<Product>getAllProduct() throws Exception;

}
