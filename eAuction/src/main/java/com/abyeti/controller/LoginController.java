package com.abyeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abyeti.model.Login;
import com.abyeti.repositories.LoginRepository;

@RestController
@RequestMapping("/api/Login")
public class LoginController extends GenericController<Login> {

	@Autowired
	LoginRepository loginRepository;

	@Autowired
	public LoginController(LoginRepository loginRepository) {
		super(loginRepository);
		System.out.print(" LCR HELLO SPRING MVC2");
	}

	/*
	 * @RequestMapping(value = "/Login/{id}", method = RequestMethod.GET) public
	 * String loginForm(Model model) { System.out.println("HELLO SPRING MVC2");
	 * model.addAttribute("login", new Login()); return "login"; } / *
	 * 
	 * @RequestMapping(value = "/Login", method = RequestMethod.POST) public
	 * ModelAndView loginSubmit(@ModelAttribute Login login, Model model) {
	 * System.out.println("HELLO SPRING MVC"); String message =
	 * "HELLO SPRING MVC"; return new ModelAndView("hellopage", "message",
	 * message); // model.addAttribute("login", login); // return "results"; }
	 * 
	 * /*
	 * 
	 * @RequestMapping(value = "/Login/name/{username}", method =
	 * RequestMethod.GET) public Iterable findByUser(@PathVariable("username")
	 * String username) { return loginRepository.findByUsername(username); }
	 */
	

	@RequestMapping(value = "/api/Login/{username}", method = RequestMethod.GET)
	public Login loginCheck(@PathVariable("username") String username) {
		return loginRepository.findByUsername(username);
	}
}