package com.matheusxavier.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusxavier.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
