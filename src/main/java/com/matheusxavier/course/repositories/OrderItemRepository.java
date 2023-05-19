package com.matheusxavier.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusxavier.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
