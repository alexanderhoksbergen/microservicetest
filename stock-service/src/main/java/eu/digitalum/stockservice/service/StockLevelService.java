package eu.digitalum.stockservice.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.digitalum.stockservice.dao.StockLevelRepository;
import eu.digitalum.stockservice.entity.StockLevel;

@Service
public class StockLevelService {
	
	@Autowired
	private StockLevelRepository stockLevelRepository;

    public List<StockLevel> findAll() {
        return stockLevelRepository.findAll();
    }

    public Optional<StockLevel> findById(Long id) {
        return stockLevelRepository.findById(id);
    }

    public StockLevel save(StockLevel stock) {
    	LocalDateTime now = LocalDateTime.now();
    	
    	stock.setTimeLastUpdate(now);
    	
    	if(stock.getTimeCreated() == null) {
    		stock.setTimeCreated(now);
    	}
    	
        return stockLevelRepository.save(stock);
    }

    public void deleteById(Long id) {
    	stockLevelRepository.deleteById(id);
    }
    
    public List<StockLevel> findByProductId(String productId) {
        return stockLevelRepository.findByProductId(productId);
    }

}
