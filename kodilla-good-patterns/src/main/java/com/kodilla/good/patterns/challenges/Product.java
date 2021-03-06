package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

    abstract class Product {

    private String productName;
    private String productDescription;
    private BigDecimal productPrice;

    public Product(String productName, String productDescription, BigDecimal productPrice) {
        this.productDescription = productDescription;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}



