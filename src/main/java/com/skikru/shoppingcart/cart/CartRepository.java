package com.skikru.shoppingcart.cart;

import com.skikru.shoppingcart.cart.data.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

interface CartRepository extends JpaRepository<Cart, Long> {
}