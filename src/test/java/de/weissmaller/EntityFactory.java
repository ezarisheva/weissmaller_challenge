package de.weissmaller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EntityFactory {

    public static Basket initializeBasket() {
        Basket basket = new Basket();
        List<Product> productList = new ArrayList<>();
        productList.add(Product.APPLE);
        productList.add(Product.APPLE);
        productList.add(Product.BANANA);
        productList.add(Product.APPLE);
        productList.add(Product.PAPAYA);
        productList.add(Product.GARLIC);
        productList.add(Product.PAPAYA);
        basket.setProductList(productList);

        return basket;

    }

    public static HashMap<Product, Price> initializePrices() {
        HashMap<Product, Price> productPrice = new HashMap<>();
        Price applePrice = new Price(Product.APPLE, new BigDecimal("0.25"), false);
        productPrice.put(Product.APPLE, applePrice);
        Price orangePrice = new Price((Product.ORANGE), new BigDecimal("0.30"), false);
        productPrice.put(Product.ORANGE, orangePrice);
        Price garlicPrice = new Price(Product.GARLIC, new BigDecimal("0.15"), false);
        productPrice.put(Product.GARLIC, garlicPrice);
        Price papayaPrice = new Price(Product.PAPAYA, new BigDecimal("0.50"), true);
        productPrice.put(Product.PAPAYA, papayaPrice);

        return productPrice;
    }
}
