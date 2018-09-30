package org.sainsburys.retail.sprinbootstarter.service.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sainsburys.retail.sprinbootstarter.dao.ProductDetailsDAO;
import org.sainsburys.retail.sprinbootstarter.model.Product;
import org.sainsburys.retail.sprinbootstarter.model.Response;
import org.sainsburys.retail.sprinbootstarter.model.Total;
import org.sainsburys.retail.sprinbootstarter.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDetailsDAO productDetailsDAO;
	public Response res = null;
	public Total total = new Total();
	private static final String ERROR_MSG = "Error retriving the product details:";
	private static final String LOGGER_CLASS = "ProductServiceLogging";

	public Response getAllProducts() {
		List<Product> productList = null;
		res = new Response();
		try {
			productList = productDetailsDAO.getAllProduct();
		} catch (Exception e) {
			Logger.getLogger(LOGGER_CLASS).log(Level.SEVERE, ERROR_MSG + e.getMessage());
		}
		res.setResults(productList);
		calculateTotalPriceAndVAT(productList);
		return res;
	}

	public void calculateTotalPriceAndVAT(List<Product> productList) {
		double gross = 0;
		double vat = 0;
		for (Product product : productList) {
			gross = gross + product.getUnit_price();
		}
		vat = gross * 0.166;
		String str = String.format("%1.2f", vat);
		total.setGross(gross);
		total.setVat(Double.valueOf(str));
		res.setTotal(total);
	}

}
