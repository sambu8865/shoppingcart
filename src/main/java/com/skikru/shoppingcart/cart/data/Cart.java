package com.skikru.shoppingcart.cart.data;

import lombok.Data;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Carts")
public class Cart {

    private @Id @GeneratedValue Long id;
    private String place;
    private Long userId;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cart_Id")
    private Set<Item> items = new HashSet<Item>();

    Cart() {}

    public Cart(String place, Long userId) {
        this.place = place;
        this.userId = userId;
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public Set<Item> getItems() {
        return Collections.unmodifiableSet(items);
    }
}
