package de.neuefische.Group4.OrderSystem.model;

import java.util.Objects;

public class Product {
    //Variables
    private String productId;
    private String name;

    //Constructor
    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    //Methods


    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    //Hash & Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
