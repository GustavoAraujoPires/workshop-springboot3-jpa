package com.educandoweb.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{
}
