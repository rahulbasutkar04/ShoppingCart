package org.example.shoppingcart.domain.model.entity;

public class Product {
    private  String  productName;
    private Double price;

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }
}
