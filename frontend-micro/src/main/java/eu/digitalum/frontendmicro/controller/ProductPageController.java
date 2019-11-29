package eu.digitalum.frontendmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.digitalum.frontendmicro.domain.Product;
import eu.digitalum.frontendmicro.domain.StockLevel;
import eu.digitalum.frontendmicro.service.ProductService;
import eu.digitalum.frontendmicro.service.StockService;

@Controller
public class ProductPageController {
	
	@Autowired
	ProductService productService;
	@Autowired
	StockService stockService;
	
	   	@RequestMapping("/product/{productId}")
	    public String findById(@PathVariable(name="productId") String productId,Model model) {
	   		
	   		Product product = productService.getProductById(productId);
	   		model.addAttribute("product", product);
	   		
	   		StockLevel stock = stockService.findById(productId);
	   		model.addAttribute("stock",stock);
	   		
	   		
	   		return "product";
	   	}

}
