package com.educandoweb.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long>{
}
