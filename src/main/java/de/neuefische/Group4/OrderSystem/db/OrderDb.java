package de.neuefische.Group4.OrderSystem.db;

import de.neuefische.Group4.OrderSystem.model.Order;
import de.neuefische.Group4.OrderSystem.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderDb {
    //Variables
    List<Order> ordersList = new ArrayList<Order>();

    //Methods
    public void addOrder(String[] products){
        String id = String.valueOf(ordersList.size());
        ordersList.add(new Order(id, products));
    }

    public List<Order> list() {
        String message  = "";
        for (Order order : ordersList) {
            message += order.toString() + " ";
        }
        return ordersList;
    }

    public Order get(String orderId) {
        for (Order item:ordersList) {
            if(item.getOrderId().equals(orderId)){
                return item;
            }
        }
        return null;
    }
}
