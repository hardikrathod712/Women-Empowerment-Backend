package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.model.NGO;

public interface NGORepository extends JpaRepository<NGO, Integer> {
}
