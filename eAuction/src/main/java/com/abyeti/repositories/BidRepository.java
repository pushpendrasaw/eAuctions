package com.abyeti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abyeti.model.Bid;

@Repository
public interface BidRepository extends JpaRepository<Bid, String> {

}
