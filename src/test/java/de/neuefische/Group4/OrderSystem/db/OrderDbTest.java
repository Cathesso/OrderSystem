package de.neuefische.Group4.OrderSystem.db;

import static org.junit.jupiter.api.Assertions.*;

class OrderDbTest {

    @Test
    public void orderDBlistShouldReturnList() {
        //Given
        OrderDb testOrders = new OrderDb();
        testOrders.addOrder(new String[]{"apple","banana","pumpkin"});
        testOrders.addOrder(new String[]{"apple","pumpkin"});
        testOrders.addOrder(new String[]{"pumpkin"});
        //When
        List <Order> expected = {"1","2","3"};

        List<Order> actual = testOrders.list();
        //Then
        assertEqual(actual, expected);

    }



}