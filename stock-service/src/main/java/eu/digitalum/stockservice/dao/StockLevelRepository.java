package eu.digitalum.stockservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.digitalum.stockservice.entity.StockLevel;

@Repository
public interface StockLevelRepository extends JpaRepository<StockLevel, Long>{
	
	List<StockLevel> findByProductId(String productId);

}
