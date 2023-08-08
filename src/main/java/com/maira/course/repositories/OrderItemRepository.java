package com.maira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maira.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
