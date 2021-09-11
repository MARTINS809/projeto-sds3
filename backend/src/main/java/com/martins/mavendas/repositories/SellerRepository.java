package com.martins.mavendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martins.mavendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
