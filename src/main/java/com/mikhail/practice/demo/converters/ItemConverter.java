package com.mikhail.practice.demo.converters;

import com.mikhail.practice.demo.dtos.ItemDto;
import com.mikhail.practice.demo.mappers.ItemMapper;
import com.mikhail.practice.demo.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ItemConverter {
    private final ItemMapper itemMapper;
    private final ItemService itemService;

    public List<ItemDto> getAll(){
        return itemMapper.toDTOList(itemService.getAll());
    }
}
