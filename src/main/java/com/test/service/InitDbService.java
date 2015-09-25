package com.test.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Wire;
import com.test.repository.WireRepository;

@Service
public class InitDbService {

	@Autowired
	private WireRepository wireRepository;

	@PostConstruct
	public void init() {
		{
			Wire wire = new Wire();
			wire.setWireNumber("A001");
			wire.setFleet("A320");
			wire.setStatus("Released");
			wireRepository.save(wire);
		}
		{
			Wire wire = new Wire();
			wire.setWireNumber("A002");
			wire.setFleet("A320");
			wire.setStatus("Released");
			wireRepository.save(wire);
		}
	}
}
