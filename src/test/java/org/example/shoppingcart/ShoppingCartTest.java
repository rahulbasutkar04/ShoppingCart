package org.example.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartTest {
    @Test
    void shouldBeAbleToCreateShoppingCart()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart();

        // assert
        assertTrue(shoppingCart instanceof ShoppingCart);
    }
}
