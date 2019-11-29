package eu.digitalum.frontendmicro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.digitalum.frontendmicro.controller.restclient.ApiGatewayRestClient;
import eu.digitalum.frontendmicro.domain.Product;

@Service
public class ProductService {
	
	@Autowired
	ApiGatewayRestClient apiGatewayProductRestClient;

	public List<Product> getProducts()  {
		return apiGatewayProductRestClient.getProducts();
	}
	
	public Product getProductById(String productId) {
		return apiGatewayProductRestClient.findProductById(productId);
	}
}
