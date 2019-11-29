package eu.digitalum.apigateway.rest.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.digitalum.apigateway.domain.Product;

@FeignClient("product-service")
@RequestMapping("/api/v1/product")
public interface ProductRestClient {
	
	@GetMapping
    public List<Product> findAll() ;
	
    @GetMapping("/{productId}")
    public Product findByProductId(@PathVariable(value = "productId") String productId); 

}
