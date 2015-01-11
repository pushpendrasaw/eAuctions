package com.abyeti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abyeti.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, String> {

}
