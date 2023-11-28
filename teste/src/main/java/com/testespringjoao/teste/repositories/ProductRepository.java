package com.testespringjoao.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringjoao.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
