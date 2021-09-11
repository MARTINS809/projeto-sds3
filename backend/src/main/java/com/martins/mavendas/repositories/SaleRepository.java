package com.martins.mavendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.martins.mavendas.dto.SaleSumDTO;
import com.martins.mavendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.martins.mavendas.dto.SaleSumDTO(obj.seller, sum(obj.amount)) "
		+ "FROM Sale AS obj GROUP BY obj.seller")
   List<SaleSumDTO> amountGroupedBySeller();
	}
