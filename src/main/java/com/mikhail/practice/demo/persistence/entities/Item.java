package com.mikhail.practice.demo.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Item extends AbstractPersistableEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 4L;

    @Column(nullable = false, unique = true)
    private String name;
    @Column
    private boolean isAvailable;
    @Column
    private BigDecimal price;
}
