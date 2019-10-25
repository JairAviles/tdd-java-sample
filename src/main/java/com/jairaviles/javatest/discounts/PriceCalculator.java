package com.jairaviles.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public PriceCalculator() {
    }

    public Double getTotal() {
        Double total = prices.stream().reduce(Double::sum).orElse(0d);
        return total * ((100 - discount) /100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void clearPrices() {
        prices.clear();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
