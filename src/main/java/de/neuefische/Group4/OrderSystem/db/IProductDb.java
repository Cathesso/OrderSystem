package de.neuefische.Group4.OrderSystem.db;

public interface IProductDb {
    public Product[] list(); //Übergabewerte: Entweder String oder Product
    public Product get(String id); //
}
