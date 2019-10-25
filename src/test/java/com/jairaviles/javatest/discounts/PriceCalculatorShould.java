package com.jairaviles.javatest.discounts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class PriceCalculatorShould {

    PriceCalculator calculator = new PriceCalculator();

    @AfterEach
    public void cleanUp() {
        calculator.clearPrices();
    }

    @Test
    public void total_zero_when_there_are_no_prices() {
        assertThat(calculator.getTotal(), is(0d));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        calculator.addPrice(1.0);
        assertThat(calculator.getTotal(), is(26.7));
    }

    @Test
    public void apply_discount_to_prices() {
        calculator.addPrice(100);
        calculator.addPrice(100);
        calculator.setDiscount(25d);
        assertThat(calculator.getTotal(), is(150d));
    }
}