package com.maira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
