package com.abyeti.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abyeti.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, String>{

}