package com.github.enviableyapper0.dao;

import com.github.enviableyapper0.beans.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderDAO {
    private static List<Order> orders = new ArrayList<>();

    public static List<Order> getAllOrder() {
        return orders;
    }

    public static int addOrder(Order order) {
        orders.add(order);
        return orders.indexOf(order);
    }

    public static Order getOrder(int index) {
        return orders.get(index);
    }

    public static boolean deleteOrder(int index) {
        try {
            orders.set(index, null);
        } catch (NoSuchElementException ex) {
            return false;
        } finally {
            return true;
        }
    }
}
