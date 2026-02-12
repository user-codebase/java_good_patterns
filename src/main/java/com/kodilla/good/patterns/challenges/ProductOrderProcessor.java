package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.user(), orderRequest.product());
        if (isOrdered) {
            informationService.inform(orderRequest.user());
            orderRepository.createOrder(orderRequest.user(), orderRequest.product());
            return new OrderDto(orderRequest.user(), true);
        } else {
            return new OrderDto(orderRequest.user(), false);
        }
    }
}
