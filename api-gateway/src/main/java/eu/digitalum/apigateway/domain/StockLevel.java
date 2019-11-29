package eu.digitalum.apigateway.domain;

import lombok.Data;

@Data
public class StockLevel {

	private String productId;
	private Long availableAmount;
	private String warehouseId;
}
