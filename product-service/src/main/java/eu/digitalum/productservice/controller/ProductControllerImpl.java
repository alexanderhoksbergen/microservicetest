package eu.digitalum.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.digitalum.productservice.entity.Product;
import eu.digitalum.productservice.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductControllerImpl implements ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }
	
    @GetMapping("/{productId}")
    public ResponseEntity<Product> findByProductId(@PathVariable String productId) {
    	Optional<Product> product = productService.findById(productId);
    	
        if (!product.isPresent() ) {
             ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(product.get());
    }
}
