package de.neuefische.Group4.OrderSystem.db;

public class ArraylistProductDb implements InterfaceProductDb{
    @Override
    public Product[] list() {
        return new Product[0];
    }

    @Override
    public Product get() {
        return null;
    }
}