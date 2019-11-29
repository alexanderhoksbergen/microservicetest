package eu.digitalum.frontendmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.digitalum.frontendmicro.service.ProductService;

@Controller
public class DefaultPageController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("productList", productService.getProducts());
		
		return "homepage";
	}
}
