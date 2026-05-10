package com.estere.ecommercebackend.cart;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    private Long userId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CartItem> items = new ArrayList<>();

    private Double total = 0.0;

    // Getters et Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public List<CartItem> getItems() { return items; }
    public void setItems(List<CartItem> items) { this.items = items; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}