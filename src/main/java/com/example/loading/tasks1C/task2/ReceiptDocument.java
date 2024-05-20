package com.example.loading.tasks1C.task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

// Приходная накладная
public class ReceiptDocument {

    private String warehouseFrom;
    private String warehouseTo;
    private double amount;
    private double price;
}
