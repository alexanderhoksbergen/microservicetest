package eu.digitalum.frontendmicro.controller.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import eu.digitalum.frontendmicro.domain.Product;
import eu.digitalum.frontendmicro.domain.StockLevel;

@FeignClient("api-gateway")
public interface ApiGatewayRestClient {
	
	@RequestMapping(method = RequestMethod.GET ,value="/api/v1/products",produces = "application/json")
	public List<Product> getProducts() ;

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/products/{productId}", produces = "application/json")
	public Product findProductById(@PathVariable(name="productId") String productId);
	
    @GetMapping("/api/v1/stock/{productId}")
    public StockLevel findById(@PathVariable(name="productId") String productId);
}
