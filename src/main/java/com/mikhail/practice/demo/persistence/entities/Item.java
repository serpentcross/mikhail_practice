package com.mikhail.practice.demo.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Item extends AbstractPersistableEntity {
    @Column(nullable = false, unique = true)
    private String name;
    @Column
    private boolean isAvailable;
    @Column
    private BigDecimal price;
}
