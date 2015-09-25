package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Wire;

public interface WireRepository extends JpaRepository<Wire, Integer> {

}
