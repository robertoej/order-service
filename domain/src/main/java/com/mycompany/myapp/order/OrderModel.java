package com.mycompany.myapp.order;

import java.util.Objects;

public final class OrderModel {

    private String orderId;
    private String orderDescription;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "orderId='" + orderId + '\'' +
                ", orderDescription='" + orderDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderModel that = (OrderModel) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderDescription, that.orderDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDescription);
    }
}
