package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Wire;
import com.test.repository.WireRepository;

@Service
public class WireService {
	
	@Autowired
	private WireRepository wireRepository;

	public Wire findOne(int id) {
		return wireRepository.findOne(id);
	}

	public List<Wire> findAll() {
		return wireRepository.findAll();
	}

}
