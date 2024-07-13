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
        // Arrange
        Product product = new Product("Test Product", 10.0); // Example product

        // Act
        boolean isAdded = cartService.add(product);

        // Assert
        Assertions.assertTrue(isAdded);
        List<Product> productsInCart = cartService.getProduct();
        Assertions.assertEquals(1, productsInCart.size());
        Assertions.assertEquals(product, productsInCart.get(0));
    }
}
