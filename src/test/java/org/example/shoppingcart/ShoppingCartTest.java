package org.example.shoppingcart;

import org.example.shoppingcart.domain.model.entity.Product;
import org.example.shoppingcart.domain.service.CartService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        assertFalse(productList.isEmpty());
    }

    @Test
    void shouldBeAbleToPurchaseProduct()
    {
        // arrange
        ShoppingCart shoppingCart=new ShoppingCart(new CartService());
        Product product=new Product("Shoes",200.0);
        Product product1=new Product("Mobile",200.0);
        shoppingCart.add(product);
        shoppingCart.add(product1);

        // act
        double amountPurchased=shoppingCart.purchase("Mobile");


        // assert
        assertEquals(amountPurchased,200);
    }
}
