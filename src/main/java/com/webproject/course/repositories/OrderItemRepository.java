package com.webproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
 