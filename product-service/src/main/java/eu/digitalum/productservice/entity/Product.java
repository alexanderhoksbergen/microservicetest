package eu.digitalum.productservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "product")
@Data
public class Product {

	


	public Product(String productId, String name, String description, Double price, String smallImageUrl,
			String imageUrl) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.smallImageUrl = smallImageUrl;
		this.imageUrl = imageUrl;
	}

	public Product() {
		super();
	}

	@Id
	@Column(nullable = false)
	private String productId;

	@Column(nullable = true)
	private String name;

	@Column(nullable = false,length = 1024)
	private String description;
	
	@Column(nullable = true)
	private Double price;
	
	@Column(nullable = true)
	private String smallImageUrl;

	@Column(nullable = true)
	private String imageUrl;
	

}
