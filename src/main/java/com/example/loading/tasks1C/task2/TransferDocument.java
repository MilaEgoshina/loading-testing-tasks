package com.example.loading.tasks1C.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransferDocument {

    // Перемещение товаров
    private String warehouseFrom;
    private String warehouseTo;
    private double amount;
}
