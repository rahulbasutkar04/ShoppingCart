package org.example.shoppingcart;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    void shouldBeAbleToCreateShoppingCart()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart();

        // assert
        assetTrue(shoppingCart instanceof ShoppingCart);
    }
}
