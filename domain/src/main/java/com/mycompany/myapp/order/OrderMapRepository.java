package com.mycompany.myapp.order;

import java.util.HashMap;
import java.util.Map;

class OrderMapRepository implements OrderRepository {

    private Map<String, OrderModel> repository;

    OrderMapRepository() {
        repository = new HashMap<>();
    }

    @Override
    public OrderModel cancelOrder(String orderId) {
        if (repository.containsKey(orderId)) {
            OrderModel orderModel = repository.get(orderId);
            repository.remove(orderId);
            return orderModel;
        } else {
            return null;
        }
    }

    @Override
    public Boolean createOrder(OrderModel order) {
        try {
            repository.put(order.getOrderId(), order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public OrderModel getOrderById(String orderId) {
        return repository.get(orderId);
    }
}
