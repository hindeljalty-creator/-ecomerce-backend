package com.estere.ecommercebackend.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/{userId}")
    public Cart getCart(@PathVariable Long userId) {
        return cartRepository.findByUserId(userId).orElse(new Cart());
    }
}
