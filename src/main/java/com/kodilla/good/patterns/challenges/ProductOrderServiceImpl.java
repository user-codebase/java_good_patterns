package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceImpl implements OrderService {
    @Override
    public boolean order(User user, Product product) {
        System.out.println("Ordering product: " + product.name() + " for user: " + user.getName());
        return true;
    }
}
