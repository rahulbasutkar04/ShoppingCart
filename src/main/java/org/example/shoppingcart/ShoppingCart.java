package org.example.shoppingcart;

import org.example.shoppingcart.domain.model.entity.Product;
import org.example.shoppingcart.domain.service.CartService;

import java.util.List;

public class ShoppingCart {

    private  CartService cartService;

    public ShoppingCart(CartService cartService) {
        this.cartService = cartService;
    }

    public boolean add(Product product) {

        return cartService.add(product);
    }

    public List<Product> getProducts() {
        return cartService.getProduct();
    }

    public double  purchase(String productName) {
           return cartService.purchaseProduct(productName);
    }
    }

