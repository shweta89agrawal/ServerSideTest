package org.sainsburys.retail.sprinbootstarter.resouces;

import java.util.List;

import org.sainsburys.retail.sprinbootstarter.model.Product;
import org.sainsburys.retail.sprinbootstarter.model.Response;
import org.sainsburys.retail.sprinbootstarter.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/products")
	public Response getProducts() {
        return productService.getAllProducts();
    }

}
