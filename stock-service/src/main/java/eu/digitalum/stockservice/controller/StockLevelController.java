package eu.digitalum.stockservice.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.digitalum.stockservice.entity.StockLevel;
import eu.digitalum.stockservice.service.StockLevelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/stocklevel")
public class StockLevelController {

	@Autowired
	private StockLevelService stockLevelService;
	
	
	@GetMapping
    public ResponseEntity<List<StockLevel>> findAll() {
        return ResponseEntity.ok(stockLevelService.findAll());
    }
	
	@PostMapping
    public ResponseEntity create(@Valid @RequestBody StockLevel stockLevel) {
        return ResponseEntity.ok(stockLevelService.save(stockLevel));
    }
	
    @GetMapping("/{id}")
    public ResponseEntity<StockLevel> findById(@PathVariable Long id) {
        Optional<StockLevel> stock = stockLevelService.findById(id);
        if (!stock.isPresent()) {
             ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stock.get());
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<StockLevel>> findByProductId(@PathVariable String productId) {
        List<StockLevel> stock = stockLevelService.findByProductId(productId);
        if (null == stock || stock.isEmpty()) {
             ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stock);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<StockLevel> update(@PathVariable Long id, @Valid @RequestBody StockLevel StockLevel) {
        if (!stockLevelService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stockLevelService.save(StockLevel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (!stockLevelService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        stockLevelService.deleteById(id);

        return ResponseEntity.ok().build();
    }
	
}
