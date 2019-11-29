package eu.digitalum.apigateway.rest.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.digitalum.apigateway.domain.StockLevel;

@FeignClient("stock-service")
@RequestMapping("/api/v1/stocklevel")
public interface StockRestClient {

    @GetMapping("/product/{productId}")
    public List<StockLevel> findByProductId(@PathVariable(name="productId") String productId);
}
