package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producer{
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("GlutenFreeShop is processing your order...");
        return orderRequest.getQuantity() <= 50;
    }
}
