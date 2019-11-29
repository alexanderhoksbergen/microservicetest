package eu.digitalum.apigateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eu.digitalum.apigateway.domain.Product;
import eu.digitalum.apigateway.service.ProductService;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(method = RequestMethod.GET ,produces = "application/json")
	public @ResponseBody ResponseEntity<List<Product>> getProducts() {

		List<Product> productList = productService.getAllProducts();

		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/{productId}", produces = "application/json")
	public @ResponseBody ResponseEntity<Product> findProductById(@PathVariable(name="productId") String productId) {
		return new ResponseEntity<Product>(productService.findProductById(productId), HttpStatus.OK);
	}

}
