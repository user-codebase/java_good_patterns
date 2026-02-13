package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderRequest order1 = new OrderRequest("Bio carrot", 20);
        OrderRequest order2 = new OrderRequest("Bread", 60);
        Producer extraFood = new ExtraFoodShop();
        Producer healthy = new HealthyShop();
        Producer glutenFree = new GlutenFreeShop();

        orderService.order(extraFood, order1);
        System.out.println("---------------------");

        orderService.order(healthy, order1);
        System.out.println("---------------------");

        orderService.order(glutenFree, order2);
    }
}
