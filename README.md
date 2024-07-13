# Shopping Cart

## Problem Statement

Create a shopping cart with the following functionalities:

1. Add Product: Adds a product with attributes `name` and `price`.
2. Purchase a Product: Allows purchasing a product by its name.

## Analysis

### Domain

#### Model

- **Entity: Product**
    - Attributes:
        - `name` (String): Name of the product.
        - `price` (Double): Price of the product.

### Service

- **AddProduct**
    - `add(String productName, Double price)`: Adds a product to the shopping cart with the specified name and price.

- **PurchaseProduct**
    - `buy(String name)`: Allows purchasing a product from the shopping cart by its name.



### Main Class (ShoppingCart.java)