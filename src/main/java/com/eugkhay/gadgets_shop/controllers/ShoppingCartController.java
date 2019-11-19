package com.eugkhay.gadgets_shop.controllers;

import com.eugkhay.gadgets_shop.model.Product;
import com.eugkhay.gadgets_shop.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    private final ShoppingCart cart;

    public ShoppingCartController(ShoppingCart cart) {
        this.cart = cart;
    }

    @GetMapping
    public ShoppingCart getCart() {
        return cart;
    }

    @PostMapping("{amount}")
    public ShoppingCart addItemToCart(@RequestBody Product product,
                                      @PathVariable Integer amount) {
        cart.getProducts().merge(product, amount, Integer::sum);
        return cart;
    }
}
