package com.abyeti.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class GenericController<T> {

	protected JpaRepository<T, String> repository;

	protected GenericController(JpaRepository<T, String> repo) {
		this.repository = repo;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<T> findAll() {
		return repository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public T create(@RequestBody T entity) {
		return repository.save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id) {
		repository.delete(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public T findById(@PathVariable("id") String username) {
		return repository.findOne(username);
	}

}
