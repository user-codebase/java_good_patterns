package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderService {
    public void order(Producer producer, OrderRequest orderRequest) {
        System.out.println("Order has been initialized...");
        boolean isProcessed = producer.process(orderRequest);
        if (isProcessed) {
            System.out.println("Order has been realized properly.");
        } else {
            System.out.println("Order has not been realized.");
        }
    }
}
