package de.neuefische.Group4.OrderSystem.db;

public class ProductDb implements IProductDb{
    @Override
    public Product[] list(int zahl) {
        return new Product[0];
    }

    @Override
    public Product get() {
        return null;
    }
}
