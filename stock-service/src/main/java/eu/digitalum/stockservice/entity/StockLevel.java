package eu.digitalum.stockservice.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "stocklevel")
@Table(indexes = {@Index(name = "STOCKLEVEL_INDX_0", columnList = "productId") })
@Data
public class StockLevel implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5510082287032771584L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String productId;
	
	@Column(nullable = false)
	private Long availableAmount;
	@Column(nullable = true)
	private Long reservedAmount;
	@Column(nullable = true)
	private Long oversellingAmount;
	@Column(nullable = true)
	private Long preOrderAmount;
	@Column(nullable = false)
	private String warehouseId;
	
	@Column(nullable = false)
	private LocalDateTime timeCreated;
	
	@Column(nullable = true)
	private LocalDateTime timeLastUpdate;

	public StockLevel(String productId, Long availableAmount, String warehouseId, LocalDateTime timeCreated) {
		super();
		this.productId = productId;
		this.availableAmount = availableAmount;
		this.warehouseId = warehouseId;
		this.timeCreated = timeCreated;
	}

	public StockLevel() {
		super();
	}

	

}
