package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("ExtraFoodShop is processing your order: " + orderRequest.getProductName());
        return orderRequest.getQuantity() < 100;
    }
}
