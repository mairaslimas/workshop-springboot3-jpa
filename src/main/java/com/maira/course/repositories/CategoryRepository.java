package com.maira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
