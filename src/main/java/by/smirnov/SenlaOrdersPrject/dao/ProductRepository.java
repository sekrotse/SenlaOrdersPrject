package by.smirnov.SenlaOrdersPrject.dao;

import by.smirnov.SenlaOrdersPrject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
