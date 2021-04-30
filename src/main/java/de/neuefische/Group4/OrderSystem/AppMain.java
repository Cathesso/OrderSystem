package de.neuefische.Group4.OrderSystem;
import de.neuefische.Group4.OrderSystem.db.*;
import de.neuefische.Group4.OrderSystem.model.*;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        //OrderDb mit Produkt String[] anlegen
        OrderDb orders = new OrderDb();
        orders.addOrder(new String[]{"apple","banana"});
        orders.addOrder(new String[]{"book","cookie"});
        orders.addOrder(new String[]{"sunglasses","dough", "pizza"});

        //Über OrderService Bestellungen ausgeben und eine Bestellung hinzufügen
        OrderService orderService = new OrderService();
        System.out.println(orderService.listOrder(orders.list()));
        orderService.addOrder(orders, new String[]{"avocado","pear"});
        System.out.println(orderService.listOrder(orders.list()));


        //ArrayList mit Produkten erstellen
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("1", "cherry"));
        productList.add(new Product("2", "apple"));
        productList.add(new Product("3", "banana"));
        productList.add(new Product("4", "pineapple"));

        //Product Arraylist über Product Db ausgeben
        ArraylistProductDb productDb = new ArraylistProductDb(productList);
        System.out.println(productDb.list());

        //Bestellung über orderProducts-Methode, die Produkte der Order mit Bestand der ProductDb abgleicht
        System.out.println(orderService.orderProducts(new Order("20", new String[]{"apple", "banana"}), productDb));

        //OrderDb get-Methode testen
        System.out.println(orders.get("1"));
    }
}