package org.codingdojo.kiwi.potter;

import java.util.*;

public class BasketSet extends Basket{
    public BasketSet() {
    }

    public BasketSet(Map books) {
        super(books);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * getDiscount();
    }

    private double getDiscount() {
        switch (books.size()) {
            case 2:
                return 0.95;
            case 3:
                return 0.9;
            case 4:
                return 0.8;
            case 5:
                return 0.75;
            default:
                return 1;
        }
    }

    private double getPrice() {
        final double ORIGINAL_SINGLE_BOOK_PRICE = 8.0;
        return ORIGINAL_SINGLE_BOOK_PRICE * books.size();
    }

    public void addBook(String type) {
        addBook(type, 1);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object obj : books.keySet()) {
            result.append((String) obj);
            result.append(" ");
        }
        return result.toString();
    }

    public Set getBookNames() {
        return books.keySet();
    }
}
