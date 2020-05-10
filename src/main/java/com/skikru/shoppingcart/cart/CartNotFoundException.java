package com.skikru.shoppingcart.cart;

class CartNotFoundException extends RuntimeException {

    CartNotFoundException(Long id) {
        super("Cart not found " + id);
    }
}
