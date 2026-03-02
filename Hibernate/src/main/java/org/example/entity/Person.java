package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @Id
    private int id;

    @Override
    public String toString() {
        return "Person(id=" + id + ", name=" + name + ")";
    }
    private String name;
}
