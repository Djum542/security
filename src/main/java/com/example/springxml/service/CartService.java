package com.example.springxml.service;

import com.example.springxml.model.Cart;

import java.util.List;
import java.util.Optional;

public interface CartService {
    List<Cart> getAllCart();

    void addCart(Cart cart);

    void removeCartById(long id);

    Optional<Cart> getCartById(long id);

    List<Cart> getAllCartByCategoryId(int id);

    List<Cart> search(String keyword);
}
