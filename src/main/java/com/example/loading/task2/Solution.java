package com.example.loading.task2;

public class Solution {

    public static void main(String[] args) {
        int x = 2;
        int y = 7;

        y = y + 2 * x;
        x = x * 3;
        // x = x * 16; - Эта строка не нужна, так как значение y переопределяется
        // y = y + 2 * x; Эта строка не нужна, так как значение x переопределяется
        y = x - y;

        System.out.println(y);
    }

}
