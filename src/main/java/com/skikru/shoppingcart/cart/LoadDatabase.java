package com.skikru.shoppingcart.cart;

import com.skikru.shoppingcart.cart.data.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(CartRepository repository) {
        List<Item> items = new ArrayList<>();
//        items.add(new Item("item1", 10));
        return args -> {
//            log.info("Preloading " + repository.save(new Cart("Bilbo Baggins", items)));
//            log.info("Preloading " + repository.save(new Cart("Frodo Baggins", "thief")));
        };
    }
}

