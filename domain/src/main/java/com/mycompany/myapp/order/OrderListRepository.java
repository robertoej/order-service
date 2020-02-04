package com.mycompany.myapp.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class OrderListRepository implements OrderRepository {

    private List<OrderModel> repository;

    OrderListRepository() {
        repository = new ArrayList<>();
    }

    @Override
    public OrderModel cancelOrder(String orderId) {
        Optional<OrderModel> orderToBeCancelled = repository
                .stream()
                .filter(order -> orderId.equals(order.getOrderId()))
                .findFirst();

        if (orderToBeCancelled.isPresent()) {
            repository.remove(orderToBeCancelled.get());
            return orderToBeCancelled.get();
        } else {
            return null;
        }
    }

    @Override
    public Boolean createOrder(OrderModel order) {
        try {
            repository.add(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public OrderModel getOrderById(String orderId) {
        return repository
                .stream()
                .filter(order -> orderId.equals(order.getOrderId()))
                .findFirst()
                .orElse(null);
    }
}
