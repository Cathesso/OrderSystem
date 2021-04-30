package de.neuefische.Group4.OrderSystem.model;

import java.util.Objects;

public class Order {
    //Variables
    private String orderId;
    private String[] products;

    //Constructor
    public Order(String orderId, String[] products) {
        this.orderId = orderId;
        this.products = products;
    }

    //Getter & Setter
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    //Hash & Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId.equals(order.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
