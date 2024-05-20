package com.example.loading.tasks1C.task1;

public class Equipment {

    private String name;
    private int quantity;
    private int price;
    private int expirationPeriod; // в месяцах
    private int usagePeriod; // в месяцах

    public Equipment(String name, int quantity, int price, int expirationPeriod, int usagePeriod) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.expirationPeriod = expirationPeriod;
        this.usagePeriod = usagePeriod;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getExpirationPeriod() {
        return expirationPeriod;
    }

    public int getUsagePeriod() {
        return usagePeriod;
    }
}
