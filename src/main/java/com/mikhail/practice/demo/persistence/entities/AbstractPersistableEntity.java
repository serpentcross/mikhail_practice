package com.mikhail.practice.demo.persistence.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@SuperBuilder(toBuilder = true)
public abstract class AbstractPersistableEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @UuidGenerator
    protected UUID id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPersistableEntity that)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}