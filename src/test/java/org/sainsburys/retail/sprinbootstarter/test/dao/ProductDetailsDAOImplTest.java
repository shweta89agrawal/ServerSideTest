package org.sainsburys.retail.sprinbootstarter.test.dao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.sainsburys.retail.sprinbootstarter.dao.impl.ProductDetailsDAOImpl;
import org.sainsburys.retail.sprinbootstarter.model.Product;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ProductDetailsDAOImpl.class, Files.class, Paths.class })
public class ProductDetailsDAOImplTest {
	ProductDetailsDAOImpl productDetailsDAOImpl;

	@Test
	public void testGetAllProduct() throws Exception {

		productDetailsDAOImpl = new ProductDetailsDAOImpl();
		PowerMockito.mockStatic(Files.class);
		PowerMockito.mockStatic(Paths.class);
		PowerMockito.when((Paths.get(Mockito.anyString()))).thenReturn(Mockito.any(Path.class));
		List<Product> productList = productDetailsDAOImpl.getAllProduct();
		Assert.assertNotNull(productList);
	}

}
