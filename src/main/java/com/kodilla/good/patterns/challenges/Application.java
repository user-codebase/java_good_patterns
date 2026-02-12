package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        User user = new User("Jan Kowalski");
        Product product = new Product("PlayStation 5");

        OrderRequest orderRequest = new OrderRequest(user, product);

        ProductOrderProcessor processor = new ProductOrderProcessor(new EmailService(), new ProductOrderServiceImpl(), new ProductOrderRepository());

        processor.process(orderRequest);
    }
}

