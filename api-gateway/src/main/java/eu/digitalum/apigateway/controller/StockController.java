package eu.digitalum.apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.digitalum.apigateway.domain.StockLevel;
import eu.digitalum.apigateway.service.StockService;

@RestController
@RequestMapping(value = "/api/v1/stock")
public class StockController {
	
	@Autowired
	StockService stockService;

    @GetMapping("/{productId}")
    public ResponseEntity<StockLevel> findById(@PathVariable(name="productId") String productId) {
        StockLevel stock = stockService.findByProductId(productId).get(0);
        return ResponseEntity.ok(stock);
    }
}
