package com.mikhail.practice.demo.persistence.repositories;

import com.mikhail.practice.demo.persistence.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {

}
