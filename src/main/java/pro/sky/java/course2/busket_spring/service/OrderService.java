package pro.sky.java.course2.busket_spring.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface OrderService {
    void addItemsToCart(List<Integer> itemsId);
    List<Integer> getItems();
}
