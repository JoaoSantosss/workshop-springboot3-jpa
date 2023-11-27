package com.testespringjoao.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringjoao.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
