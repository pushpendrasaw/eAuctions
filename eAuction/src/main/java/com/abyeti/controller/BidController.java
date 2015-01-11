package com.abyeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abyeti.model.Bid;
import com.abyeti.repositories.BidRepository;

@RestController
@RequestMapping("/Bid")
public class BidController extends GenericController<Bid> {

	@Autowired
	public BidController(BidRepository bidRepository) {
		super(bidRepository);
	}

}
