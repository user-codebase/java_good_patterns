package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("HealthyShop is processing your order: " + orderRequest.getProductName());
        return orderRequest.getProductName().toLowerCase().contains("bio");
    }
}
