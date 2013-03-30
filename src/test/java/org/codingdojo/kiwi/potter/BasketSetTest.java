package org.codingdojo.kiwi.potter;

import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BasketSetTest {
    @Test
    public void should_return_8_when_only_one_book() {
        BasketSet basket = new BasketSet();
        basket.addBook("first");
        assertThat(basket.getDiscountPrice(), is(8.0));
    }

    @Test
    public void should_give_5_percentage_discount_when_two_different_kinds_of_books() {
        BasketSet basket = new BasketSet();
        basket.addBook("first");
        basket.addBook("second");
        assertThat(basket.getDiscountPrice(), is(16.0 * 0.95));
    }

    @Test
    public void should_give_10_percentage_discount_when_three_different_kinds() {
        BasketSet basket = new BasketSet();
        basket.addBook("first");
        basket.addBook("second");
        basket.addBook("third");
        assertThat(basket.getDiscountPrice(), is(24 * 0.9));
    }

    @Test
    public void should_give_20_percent_discount_when_four_different_kinds() {
        BasketSet basket = new BasketSet();
        basket.addBook("first");
        basket.addBook("second");
        basket.addBook("three");
        basket.addBook("four");
        assertThat(basket.getDiscountPrice(), is(32 * 0.8));
    }

    @Test
    public void should_give_25_percent_discount_when_five_different_kinds() {
        BasketSet basket = new BasketSet();
        basket.addBook("first");
        basket.addBook("second");
        basket.addBook("three");
        basket.addBook("four");
        basket.addBook("five");
        assertThat(basket.getDiscountPrice(), is(40 * 0.75));
    }
}
