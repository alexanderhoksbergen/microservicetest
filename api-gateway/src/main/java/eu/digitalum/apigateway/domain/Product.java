package eu.digitalum.apigateway.domain;

import lombok.Data;

@Data
public class Product {

	public Product() {
		super();
	}



	private String productId;

	private String name;

	private String description;

	private Double price;

	private String smallImageUrl;

	private String imageUrl;
}
