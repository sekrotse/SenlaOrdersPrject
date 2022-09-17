package by.smirnov.SenlaOrdersPrject.dao;

import by.smirnov.SenlaOrdersPrject.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
