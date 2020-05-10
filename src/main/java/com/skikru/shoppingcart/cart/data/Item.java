package com.skikru.shoppingcart.cart.data;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Getter
@Table(name = "Items")
public class Item {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int count;

    Item() {}

    public Item(String name, int count) {
        this.name = name;
        this.count = count;
    }
}
