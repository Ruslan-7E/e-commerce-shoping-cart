package pro.sky.ecommerceshopingcart.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private List<Integer> cart = new ArrayList<>();

    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }

    public List<Integer> getAll() {
        return cart;
    }
}
