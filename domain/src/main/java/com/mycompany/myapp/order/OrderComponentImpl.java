package com.mycompany.myapp.order;

class OrderComponentImpl implements OrderComponent {

    private OrderRepository orderRepository;

    OrderComponentImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderModel cancelOrder(String orderId) {
        return orderRepository.cancelOrder(orderId);
    }

    @Override
    public Boolean createOrder(OrderModel orderModel) {
        return orderRepository.createOrder(orderModel);
    }

    @Override
    public OrderModel getOrderById(String orderId) {
        return orderRepository.getOrderById(orderId);
    }
}
