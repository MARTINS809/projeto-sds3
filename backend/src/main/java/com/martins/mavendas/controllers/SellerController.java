package com.martins.mavendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martins.mavendas.dto.SellerDTO;
import com.martins.mavendas.service.SellerService;

@RestController
@RequestMapping(value ="/sellers")
public class SellerController {
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findall();
		return ResponseEntity.ok(list);
	}
	
}
