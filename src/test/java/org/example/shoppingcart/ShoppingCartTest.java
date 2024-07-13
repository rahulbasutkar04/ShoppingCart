package org.example.shoppingcart;

import org.example.shoppingcart.domain.model.entity.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void shouldBeAbleToCreateProductEntity()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart();
        Product actualProduct=new Product("Shoes",200.0);

        // act
        Product expectedProduct=actualProduct;

        // assert
        assertEquals(actualProduct,expectedProduct);
    }
}
