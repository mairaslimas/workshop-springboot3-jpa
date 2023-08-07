package com.maira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
