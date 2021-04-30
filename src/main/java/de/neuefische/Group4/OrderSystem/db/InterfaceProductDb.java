package de.neuefische.Group4.OrderSystem.db;

public interface InterfaceProductDb {
    public Product[] list();
    public Product get(String id); //
}
