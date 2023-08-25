package com.example.springxml.controller;

import com.example.springxml.model.Cart;
import com.example.springxml.model.Product;
import com.example.springxml.model.User;
import com.example.springxml.service.CartSer;
import com.example.springxml.service.CategorySer;
import com.example.springxml.service.ProductSer;
import com.example.springxml.service.UserSer;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductSer productSer;
    @Autowired
    UserSer userSer;
    @Autowired
    CartSer cartSer;
    private List<Product> carts;
    @PostMapping(value = "/addcartitem", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Model> addcartitem(@RequestParam("productId") int productId, @RequestParam("quantity") int quantity,@RequestParam("userid") int userid
                                            , Model model, HttpSession session) {
        Product product = productSer.getProductById(productId).get();
        if (carts == null) {
            carts = new ArrayList<>();
            session.setAttribute("listcart", carts);
        }
        int current = carts.size();
        if (current == carts.size()) {
            Cart cart = new Cart();
            cart.setProduct_id(productId);
            cart.setUser_id(userid);
            cart.setQuantty(quantity);
            cartSer.addCart(cart);
        }
        model.addAttribute("cart", cartSer.getAllCart());
        return ResponseEntity.ok().body(model);
    }
    @GetMapping("/cart")
    public ResponseEntity<List> cartitem(@RequestParam("userid") long userid, Model model, HttpSession session){
        Cart cart = cartSer.getCartById(userid).get();
        Product produc = productSer.getProductById(cart.getProduct_id()).get();
        if (carts == null) {
            carts = new ArrayList<>();
            session.setAttribute("listcart", carts);
        }
        int current = carts.size();
        if (current == carts.size()) {
            Product product = new Product();
            product.setId(cart.getProduct_id());
            product.setName(produc.getName());
            product.setCategory(produc.getCategory());
            product.setPrice(produc.getPrice());
            product.setQuantity((int) cart.getQuantty());
            product.setDescription(produc.getDescription());
            product.setImageName(produc.getImageName());
            carts.add(product);
        }
        return ResponseEntity.ok().body(carts);
    }
//        for (int i = 0; i < carts.size();i++){
//            if (carts.get(i).getId() == productId){
//                carts.get(i).setProduct_id(productId);
//            }
//        }

}
