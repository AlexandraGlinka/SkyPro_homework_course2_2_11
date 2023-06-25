package pro.sky.java.course2.busket_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.busket_spring.service.OrderService;
import pro.sky.java.course2.busket_spring.service.OrderServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addItemsToCart(List<Integer> itemsId) {
        orderService.addItemsToCart(itemsId);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}
