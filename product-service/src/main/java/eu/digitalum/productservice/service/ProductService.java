package eu.digitalum.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.digitalum.productservice.entity.Product;
import eu.digitalum.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
    public Optional<Product> findById(String productId) {
        return productRepository.findById(productId);
    }

}
