package eu.digitalum.apigateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.digitalum.apigateway.domain.Product;
import eu.digitalum.apigateway.rest.clients.ProductRestClient;

@Service
public class ProductService {
	
	@Autowired
	ProductRestClient productRestClient;
	
	public List<Product> getAllProducts() {
		return productRestClient.findAll();
	}

	public Product findProductById(String productId) {
		return productRestClient.findByProductId(productId);
	}
}
