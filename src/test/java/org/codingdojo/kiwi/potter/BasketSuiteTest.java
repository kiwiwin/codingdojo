package org.codingdojo.kiwi.potter;

import org.junit.*;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class BasketSuiteTest {
    @Test
    public void sub_basket_set_collection_should_be_empty() {
        BasketSuite suite = new BasketSuite();
        assertThat(suite.getSubBasketSets().isEmpty(), is(true));
    }

    @Test
    public void sub_basket_set_collection_should_has_only_one_item() {
        BasketSuite suite = new BasketSuite();
        suite.addBook("first", 1);
        assertThat(suite.getSubBasketSets().size(), is(1));
    }

    @Test
    public void sub_basket_set_collection_should_has_3_item() {
        BasketSuite suite = new BasketSuite();
        suite.addBook("first", 2);
        suite.addBook("second", 2);
        suite.addBook("third", 2);
        suite.addBook("forth", 1);
        suite.addBook("fifth", 1);
        assertThat(suite.getDiscountPrice(), is(51.2));
    }
}
