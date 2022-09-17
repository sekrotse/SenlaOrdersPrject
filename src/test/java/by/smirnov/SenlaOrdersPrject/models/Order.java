package by.smirnov.SenlaOrdersPrject.models;

@Entity
@Getter
@Setter

public class Order {

    private int id;
    private int userId;
    private String status;
    private String createdAt;
}
