package org.capg.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "laptop")

public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String brand;
    private double price;

    @OneToOne(mappedBy = "laptop")
    private Student1 student;

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}