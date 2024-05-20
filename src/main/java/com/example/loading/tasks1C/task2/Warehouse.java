package com.example.loading.tasks1C.task2;

import java.util.HashMap;
import java.util.Map;

// Класс склада, который будет отслеживать остатки товаров и их стоимость
public class Warehouse {

    private String name;
    private Map<String, Double> items = new HashMap<>();
    private Map<String, Double> prices = new HashMap<>();

    public Warehouse(String name) {
        this.name = name;
    }

    public void receiveItem(String itemName, double amount, double price) {
        if (items.containsKey(itemName)) {
            items.put(itemName, items.get(itemName) + amount);
            prices.put(itemName, price);
        } else {
            items.put(itemName, amount);
            prices.put(itemName, price);
        }
    }

    public void sellItem(String itemName, double amount) {
        if (items.containsKey(itemName)) {
            if (items.get(itemName) >= amount) {
                items.put(itemName, items.get(itemName) - amount);
            } else {
                System.out.println("Not enough items in stock!");
            }
        }
    }

    public void transferItem(String itemName, double amount, Warehouse toWarehouse) {
        if (items.containsKey(itemName)) {
            if (items.get(itemName) >= amount) {
                items.put(itemName, items.get(itemName) - amount);
                toWarehouse.receiveItem(itemName, amount, prices.get(itemName));
            } else {
                System.out.println("Not enough items in stock!");
            }
        }
    }

    public void printStockReport() {
        System.out.println("Stock report for warehouse " + name + ":");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            String itemName = entry.getKey();
            double amount = entry.getValue();
            double price = prices.get(itemName);
            System.out.println("Item: " + itemName + ", Amount: " + amount + ", Price: " + price);
        }
    }
}
