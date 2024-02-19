package com.mikhail.practice.demo.mappers;

import com.mikhail.practice.demo.dtos.ItemDto;
import com.mikhail.practice.demo.persistence.entities.Item;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ItemMapper {
    Item toEntity(ItemDto itemDto);
    ItemDto toDTO (Item item);
    List<Item> toEntityList(List<ItemDto> itemDtos);
    List<ItemDto> toDTOList(List<Item> items);
}
