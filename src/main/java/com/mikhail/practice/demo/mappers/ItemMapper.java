package com.mikhail.practice.demo.mappers;

import com.mikhail.practice.demo.dtos.ItemDto;
import com.mikhail.practice.demo.persistence.entities.Item;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    Item toEntity(ItemDto itemDto);
    ItemDto toDto(Item item);
    List<Item> toEntityList(List<ItemDto> itemDtos);
    List<ItemDto> toDtoList(List<Item> items);

}