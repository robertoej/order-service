package com.mycompany.myapp.order;

public interface OrderComponent {

    OrderModel cancelOrder(String orderId);
    Boolean createOrder(OrderModel orderModel);
    OrderModel getOrderById(String orderId);
}
