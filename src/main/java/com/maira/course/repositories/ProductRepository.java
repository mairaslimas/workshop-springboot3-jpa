package com.maira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
