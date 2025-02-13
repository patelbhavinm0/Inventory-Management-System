package com.example.W2Assignment2.repo;

import com.example.W2Assignment2.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
