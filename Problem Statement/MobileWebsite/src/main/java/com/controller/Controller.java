package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Models;
import com.services.IServices;

@RestController
@RequestMapping(path="/insert")
public class Controller {
	
	@Autowired
	IServices iservices;
	
	@CrossOrigin
	@PostMapping
	public String Insert(@RequestBody Models models) {
		return iservices.Insert(models);
	}
	
}
