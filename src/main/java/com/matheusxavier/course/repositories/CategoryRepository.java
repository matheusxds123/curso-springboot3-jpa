package com.matheusxavier.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusxavier.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
