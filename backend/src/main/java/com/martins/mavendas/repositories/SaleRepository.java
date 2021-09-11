package com.martins.mavendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martins.mavendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	

	}
