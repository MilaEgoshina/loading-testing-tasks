package com.example.loading.task1;

import java.util.Arrays;
import java.util.Random;

// Приведена программа на Java для генерации массива из 50 случайных чисел от -50 до 50 и его сортировки.
// Программа должна выводить на экран массив до сортировки и после сортировки. Сортировать массив необходимо по возрастанию.

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50]; // здесь нужно указать размер массива
        for(int i = 0; i < array.length; i++){ // исправляем условие на i < array.length, иначе будет выходить ошибка ArrayIndexOutOfBoundsException
            array[i]= random.nextInt(101) - 50; // // определяем генерацию чисел от -50 до 50
        }
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) { // исправляем тип данных на int[]
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { // исправляем условие для сортировки по возрастанию
                    int current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                }
            }
        }// убираем возврат массива в функции
    }
}
