package by.smirnov.SenlaOrdersPrject.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private int price;

    @Column(name="status")
    private ProductStatus status;

    @Column(name="created_at")
    private Timestamp createdAt;

    public Product(String name, int price, ProductStatus status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }
}
