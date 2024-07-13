package org.example.shoppingcart.domain.service;

import org.example.shoppingcart.domain.model.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CartServiceTest {

    private CartService cartService;

    @BeforeEach
    public void setUp() {
        cartService = new CartService();
    }

    @Test
    public void shouldBeAbleToAddProductToCart() {
        // arrange
        Product product = new Product("Test Product", 10.0); // Example product

        // act
        boolean isAdded = cartService.add(product);

        // assert
        Assertions.assertTrue(isAdded);
        List<Product> productsInCart = cartService.getProduct();
        Assertions.assertEquals(1, productsInCart.size());
        Assertions.assertEquals(product, productsInCart.get(0));
    }
    @Test
    public void shouldBeAbleToPurchaseProduct() {
        // arrange
        Product product1 = new Product("Product 1", 15.0);
        Product product2 = new Product("Product 2", 20.0);
        cartService.add(product1);
        cartService.add(product2);

        // act
        double amount1 = cartService.purchaseProduct("Product 1");
        double amount2 = cartService.purchaseProduct("Product 2");

        // assert
        Assertions.assertEquals(15.0, amount1);
        Assertions.assertEquals(20.0, amount2);
    }


}
