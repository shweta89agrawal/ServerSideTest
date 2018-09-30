package org.sainsburys.retail.sprinbootstarter.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.sainsburys.retail.sprinbootstarter.dao.ProductDetailsDAO;
import org.sainsburys.retail.sprinbootstarter.model.Product;
import org.springframework.stereotype.Service;

@Service(value = "ProductDetailsDAO")
public class ProductDetailsDAOImpl implements ProductDetailsDAO {
	BufferedReader br;
	String productFile = "src\\main\\resources\\products.csv";
	public static final String COMMA = ",";
	List<Product> productList = new ArrayList<Product>();

	@Override
	public List<Product> getAllProduct() throws Exception {
		List<String> products = Files.readAllLines(Paths.get(productFile));
		for (String eachProduct : products) {
			String productContent[] = eachProduct.split(COMMA);
			productList.add(createListOfProductsFromString(productContent));
		}
		return productList;

	}

	public Product createListOfProductsFromString(String[] productContent) {
		Product p = new Product();
		p.setTitle(productContent[0].substring(1));
		if (null != productContent[1] && !productContent[1].isEmpty()) {
			p.setKcal_per_100g(Long.valueOf(productContent[1]));
		}
		if (null != productContent[2] && !productContent[2].isEmpty()) {
			p.setUnit_price(Double.valueOf(productContent[2]));
		}
		
		p.setDescription(productContent[3].substring(0, productContent[3].length() - 1));
		return p;
	}

}
