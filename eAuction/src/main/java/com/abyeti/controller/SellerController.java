package com.abyeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abyeti.model.Seller;
import com.abyeti.repositories.SellerRepository;

@RestController
@RequestMapping("/Seller")
public class SellerController extends GenericController<Seller> {

	@Autowired
	public SellerController(SellerRepository sellerRepository) {
		super(sellerRepository);
	}
}