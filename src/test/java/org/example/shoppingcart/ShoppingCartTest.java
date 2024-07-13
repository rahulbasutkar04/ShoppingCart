package org.example.shoppingcart;

import org.example.shoppingcart.domain.model.entity.Product;
import org.example.shoppingcart.domain.service.CartService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartTest {

    @Test
    void shouldBeAbleToCreateShoppingCart()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart(new CartService());

        // assert
        assertTrue(shoppingCart instanceof ShoppingCart);
    }

    @Test
    void shouldBeAbleToCreateProductEntity()
    {
        // arrange
        Product actualProduct=new Product("Shoes",200.0);

        // act
        Product expectedProduct=actualProduct;

        // assert
        assertEquals(actualProduct,expectedProduct);
    }

    @Test
    void shouldBeAbleToAddProductInCart()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart(new CartService());
        Product product=new Product("Shoes",200.0);

        // act
        boolean isAdded=shoppingCart.add(product);

        // assert
        assertTrue(isAdded);
    }

    @Test
    void shouldBeAbleToGetAddedProductsFromCartList()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart(new CartService());
        Product product=new Product("Shoes",200.0);
        shoppingCart.add(product);

        // act
        List<Product> productList=shoppingCart.getProducts();

        // assert
        assertEquals(1,productList.size());
    }
}
