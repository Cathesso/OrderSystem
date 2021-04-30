package de.neuefische.Group4.OrderSystem.db;

import de.neuefische.Group4.OrderSystem.model.*;

import java.util.ArrayList;
import java.util.List;

public class ArraylistProductDb implements InterfaceProductDb{
    //Variables
    List<Product> productList; //Liste in der die Produkte gespeichert werden.

    public ArraylistProductDb(List<Product> productList) {
        this.productList = productList;
    }

    public String[] getProductNames() {
        String[] listOfProductsAvailable = new String[productList.size()];
        int counter = 0;
        for (Product product : productList) {
            listOfProductsAvailable[counter] = product.getName();
            counter += 1;
        } return listOfProductsAvailable;
    }

    @Override
    public String list() {
        StringBuilder out = new StringBuilder();
        for (Product product : productList) {
            out.append(product.toString());
        }
        return out.toString();
    }
}
