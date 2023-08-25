package com.example.springxml.service;

import com.example.springxml.model.Cart;
import com.example.springxml.repository.CartReponsitoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CartSer implements CartService{
    @Autowired
    CartReponsitoy cartReponsitoy;
    @Override
    public List<Cart> getAllCart() {
        return cartReponsitoy.findAll();
    }

    @Override
    public void addCart(Cart cart) {
        cartReponsitoy.save(cart);
    }

    @Override
    public void removeCartById(long id) {
        cartReponsitoy.deleteById(id);
    }

    @Override
    public Optional<Cart> getCartById(long id) {
        return cartReponsitoy.findById(id);
    }

    @Override
    public List<Cart> getAllCartByCategoryId(int id) {
        return null;
    }

    @Override
    public List<Cart> search(String keyword) {
        return null;
    }
}
