package eu.digitalum.apigateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.digitalum.apigateway.domain.StockLevel;
import eu.digitalum.apigateway.rest.clients.StockRestClient;

@Service
public class StockService {
	
	@Autowired
	StockRestClient stockRestClient;
	
    public List<StockLevel> findByProductId(String productId) {
        return stockRestClient.findByProductId(productId);
    }

}
