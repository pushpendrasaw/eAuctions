package com.abyeti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abyeti.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

	public Login findByUsername(@Param("username") String username);
}
