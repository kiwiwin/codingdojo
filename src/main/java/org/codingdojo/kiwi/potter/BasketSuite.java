package org.codingdojo.kiwi.potter;

import java.util.*;

public class BasketSuite extends Basket {
    public BasketSuite() {
    }

    public BasketSuite(Map books) {
        super(books);
    }

    public Collection<BasketSet> getSubBasketSets() {
        HashSet<BasketSet> result = new HashSet<>();
        Object[] bookNames = books.keySet().toArray();
        for (int mask = 1; mask < (1 << books.size()); mask++) {
            BasketSet basketSet = new BasketSet();
            for (int bit = 0; bit < (books.size()); bit++) {
                if ((mask & (1 << bit)) != 0) {
                    basketSet.addBook((String) bookNames[bit]);
                }
            }
            result.add(basketSet);
        }
        return result;
    }

    @Override
    public double getDiscountPrice() {
        double result = -1;
        Collection<BasketSet> subBasketSets = getSubBasketSets();
        for (Object obj : subBasketSets) {
            BasketSet basketSet = (BasketSet) obj;
            double cost = basketSet.getDiscountPrice();
            cost += removeSubBasket(basketSet).getDiscountPrice();
            if (result < 0 || cost < result) {
                result = cost;
            }
        }
        return result;
    }

    private Basket removeSubBasket(BasketSet set) {
        Map remainBooks = new HashMap();
        remainBooks.putAll(books);
        for (Object object : set.getBookNames()) {
            if ((Integer) remainBooks.get(object) > 1)
                remainBooks.put(object, (Integer) remainBooks.get(object) - 1);
            else
                remainBooks.remove(object);
        }
        return Basket.createBasket(remainBooks);
    }
}