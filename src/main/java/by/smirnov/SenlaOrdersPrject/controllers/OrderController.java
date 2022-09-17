package by.smirnov.SenlaOrdersPrject.controllers;

import by.smirnov.SenlaOrdersPrject.models.Order;
import by.smirnov.SenlaOrdersPrject.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    public List<Order> getOrders() {
        return (List<Order>) orderService.getAll();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") int id) {
        return (Order) orderService.getOne(id);
    }

    @PostMapping()
    public void saveOrder(Order order) {
        orderService.save();
    }

    @PatchMapping("/{id}")
    public void update(Order order, @PathVariable("id") int id) {
        orderService.update(order, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        orderService.delete(id);
    }
}
