package pro.sky.java.course2.busket_spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
//Session — является веб-скоупом. Новый объект создается на время существование
// сессии и закрепляется за конкретным браузером.
// Все запросы с определенного браузера в течение определенного промежутка времени
// будут работать с одним объектом. При обращении с другого браузера или
// через длительный период будет открыта новая сессия и создан новый объект.
@SessionScope // объект класса будет создаваться на каждую сессию
public class Busket {
    private final List<Integer> items = new ArrayList<>();

    public void addItemsToCart(List<Integer> itemsId) {
        items.addAll(itemsId);
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
