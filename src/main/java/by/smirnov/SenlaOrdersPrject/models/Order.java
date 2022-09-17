package by.smirnov.SenlaOrdersPrject.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="status")
    private String status;

    @Column(name="created_at")
    private String createdAt;

    public Order(int userId, String status, String createdAt) {
        this.userId = userId;
        this.status = status;
    }
}