package com.mikhail.practice.demo.dtos;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ItemDto {
    private UUID id;
    private String name;
    private boolean isAvailable;
    private BigDecimal price;
}
