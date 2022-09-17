package by.smirnov.SenlaOrdersPrject.services;

import by.smirnov.SenlaOrdersPrject.dao.OrderRepository;
import by.smirnov.SenlaOrdersPrject.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService implements ServiceInterface {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<?> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Object getOne(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public void save(Order order) {
orderRepository.delete();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {
        orderRepository.deleteAllById(Collections.singleton(id));
    }
}
