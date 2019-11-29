package eu.digitalum.frontendmicro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.digitalum.frontendmicro.controller.restclient.ApiGatewayRestClient;
import eu.digitalum.frontendmicro.domain.StockLevel;

@Service
public class StockService {
	
	@Autowired
	ApiGatewayRestClient apiGatewayStockRestClient;
	

	public StockLevel findById(String productId) {
		return apiGatewayStockRestClient.findById(productId);
	}
}
