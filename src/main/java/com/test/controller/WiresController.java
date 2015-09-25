package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Wire;
import com.test.service.WireService;

@RestController
@RequestMapping("/wires")
public class WiresController {
	
	@Autowired
	private WireService myService;
	
	@RequestMapping
	public List<Wire> list() {
		return myService.findAll();
	}

	@RequestMapping("/{id}")
	public Wire user(@PathVariable int id) {
		return myService.findOne(id);
	}
	
}
