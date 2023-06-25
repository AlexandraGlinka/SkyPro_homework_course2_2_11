package pro.sky.java.course2.busket_spring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
@Service
// можно пометить аннотацией component - ничего не изменится
// т.к. здесь БИ, лучше использовать service
//@Scope("prototype") // singleton - объект создается в единичном экземпляре

public class OrderServiceImpl implements OrderService{
    private final Busket busket;

    public OrderServiceImpl(Busket busket) {
        this.busket = busket;
    }

    @Override
    public void addItemsToCart(List<Integer> itemsId) {
        busket.addItemsToCart(itemsId);
    }

    @Override
    public List<Integer> getItems() {
        return busket.getItems();
    }
}
