package com.skikru.shoppingcart.cart;

import com.skikru.shoppingcart.cart.CartNotFoundException;
import com.skikru.shoppingcart.cart.CartRepository;
import com.skikru.shoppingcart.cart.data.Cart;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {

    private final CartRepository cartRepository;

    ShoppingCartController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @RequestMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/carts")
    public List<Cart> carts() {
        return cartRepository.findAll();
    }

    @RequestMapping("/cart/{id}")
    public Cart cart(@PathVariable Long id) {
        return cartRepository.findById(id)
                .orElseThrow(() -> new CartNotFoundException(id));
    }

    @PostMapping("/carts/{id}")
    public Cart newCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }
}
