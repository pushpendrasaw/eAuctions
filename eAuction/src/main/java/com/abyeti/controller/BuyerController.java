package com.abyeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abyeti.model.Buyer;
import com.abyeti.repositories.BuyerRepository;

@RestController
@RequestMapping("/Buyer")
public class BuyerController extends GenericController<Buyer> {

	@Autowired
	public BuyerController(BuyerRepository buyerRepository) {
		super(buyerRepository);
	}

}
