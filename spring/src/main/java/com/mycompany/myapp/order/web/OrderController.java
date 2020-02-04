package com.mycompany.myapp.order.web;

import com.mycompany.myapp.order.OrderComponent;
import com.mycompany.myapp.order.OrderModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    private OrderComponent orderComponent;

    public OrderController(OrderComponent orderComponent) {
        this.orderComponent = orderComponent;
    }

    @GetMapping
    OrderModel getOrderById(@RequestParam String orderId) {
        return orderComponent.getOrderById(orderId);
    }

    @PostMapping
    Boolean createOrder(@RequestBody OrderModel order) {
        return orderComponent.createOrder(order);
    }

    @DeleteMapping
    OrderModel cancelOrder(@RequestParam String orderId) {
        return orderComponent.cancelOrder(orderId);
    }
}
