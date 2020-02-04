package com.mycompany.myapp.order;

interface OrderRepository {

    OrderModel cancelOrder(String orderId);
    Boolean createOrder(OrderModel order);
    OrderModel getOrderById(String orderId);
}
