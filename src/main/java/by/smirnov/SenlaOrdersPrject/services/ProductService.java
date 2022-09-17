package by.smirnov.SenlaOrdersPrject.services;

import by.smirnov.SenlaOrdersPrject.dao.OrderRepository;
import by.smirnov.SenlaOrdersPrject.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService implements ServiceInterface{
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<?> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Object getOne(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void save() {

    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {
        productRepository.deleteAllById(Collections.singleton(id));
    }

}
