package org.sainsburys.retail.sprinbootstarter.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.sainsburys.retail.sprinbootstarter.dao.ProductDetailsDAO;
import org.sainsburys.retail.sprinbootstarter.model.Product;
import org.springframework.stereotype.Service;

@Service(value="ProductDetailsDAO")
public class ProductDetailsDAOImpl implements ProductDetailsDAO  {
	BufferedReader br;
	String productFile ="/products.csv";
	public static final String COMMA = ",";
	List<Product> productList = new ArrayList<Product>(); 

	@Override
	public List<Product> getAllProduct() throws Exception {
		String eachProduct = "";
		if (br != null) {
			while (null != (eachProduct = br.readLine())) {
				String[]products = eachProduct.split(COMMA);
				//productList.add((productsFromCSVrodu(products));
			}
		}
		return null;

	}
	
	public BufferedReader createBufferedReaderConnection() throws FileNotFoundException 
	{
		 br = new BufferedReader(new FileReader(productFile));
		 return br;
	}

}
