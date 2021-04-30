package de.neuefische.Group4.OrderSystem.db;

import de.neuefische.Group4.OrderSystem.model.Order;

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
}
