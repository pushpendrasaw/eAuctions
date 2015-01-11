package com.abyeti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abyeti.model.Product;
import com.abyeti.repositories.ProductRepository;

@RestController
@RequestMapping("/Product")
public class ProductController extends GenericController<Product> {

	@Autowired
	public ProductController(ProductRepository productRepository) {
		super(productRepository);

	}

	@Autowired
	ProductRepository productRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/Product")
	public ModelAndView getProduct() {
		ModelAndView modelAndView = new ModelAndView("home");
		List<Product> p = productRepository.findAll();
		modelAndView.addObject("Products", p);
		return modelAndView;
	}

}
