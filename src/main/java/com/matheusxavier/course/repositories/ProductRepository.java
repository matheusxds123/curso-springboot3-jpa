package com.matheusxavier.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusxavier.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
