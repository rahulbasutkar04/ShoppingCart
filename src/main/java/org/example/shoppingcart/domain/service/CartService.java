package org.example.shoppingcart.domain.service;

import org.example.shoppingcart.domain.model.entity.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CartService {
    static List<Product> productList =new ArrayList<>();

    public  boolean add(Product product) {
        productList.add(product);

        return productList.size()!=0;
    }

    public List<Product> getProduct() {
        return productList;
    }


    public double purchaseProduct(String productName) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductName().equals(productName)) {
                iterator.remove();
                return product.getPrice();
            }
        }
        return -1;
    }

    public  void  clear()
    {
        productList.clear();
    }
}
