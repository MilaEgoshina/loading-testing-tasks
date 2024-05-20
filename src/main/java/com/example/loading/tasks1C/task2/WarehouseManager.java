package com.example.loading.tasks1C.task2;

import java.util.HashMap;
import java.util.Map;

//Для хранения данных о складах и товарах можно использовать HashMap
public class WarehouseManager {
    private Map<String, Warehouse> warehouses = new HashMap<>();

    public void createWarehouse(String name) {
        warehouses.put(name, new Warehouse(name));
    }

    public Warehouse getWarehouse(String name) {
        return warehouses.get(name);
    }

}
