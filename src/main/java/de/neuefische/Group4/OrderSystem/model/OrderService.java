package de.neuefische.Group4.OrderSystem.model;

import de.neuefische.Group4.OrderSystem.db.ArraylistProductDb;
import de.neuefische.Group4.OrderSystem.db.OrderDb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {

    OrderDb orderDb = new OrderDb();

    public String listOrder(List<Order> list) {
        StringBuilder out = new StringBuilder();
        for (Order order : list) {
            out.append(order.toString());
        }
        return out.toString();
    }

    public void addOrder(OrderDb orderDb, String[] products){

        orderDb.addOrder(products);

    }
    
    public String orderProducts(Order order, ArraylistProductDb productList) {
        String[] productNames = productList.getProductNames();
        String result = "";
        for (String productToOrder : order.getProducts()) {
            if (Arrays.asList(productNames).contains(productToOrder)){
                result += productToOrder + " available \n";
            } else {
                result += productToOrder + " not available \n";
            };

        } return result;
    }
}
