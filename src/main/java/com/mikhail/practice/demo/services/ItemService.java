package com.mikhail.practice.demo.services;

import com.mikhail.practice.demo.persistence.entities.Item;
import com.mikhail.practice.demo.persistence.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> getAll(){
        return itemRepository.findAll();
    }
}
