package org.codingdojo.kiwi.potter;

import java.util.*;

abstract class Basket {
    protected Map books = new HashMap();

    public Basket() {
    }

    public Basket(Map books) {
        this.books = books;
    }

    public static Basket createBasket(Map books) {
        if (eachKindHasMostOneCopy(books)) {
            return new BasketSet(books);
        } else {
            return new BasketSuite(books);
        }
    }

    private static boolean eachKindHasMostOneCopy(Map book) {
        for (Object obj : book.values()) {
            if ((Integer)obj > 1) return false;
        }
        return true;
    }

    public void addBook(String type, int num) {
        books.put(type, num);
    }

    public abstract double getDiscountPrice();
}
