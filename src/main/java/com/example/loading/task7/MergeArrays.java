package com.example.loading.task7;


import java.util.ArrayList;
import java.util.List;

public class MergeArrays {
    public static int[] merge(int[] Y, int[] Z) {
        int y = Y.length;
        int z = Z.length;
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        // Проходим по обоим массивам, добавляя значения в порядке возрастания
        while (i < y && j < z) {
            if (Y[i] >= Z[j]) {
                result.add(Y[i]);
                i++;
            } else {
                result.add(Z[j]);
                j++;
            }
        }

        // Добавляем оставшиеся элементы из массива Y, если таковые имеются
        while (i < y) {
            result.add(Y[i]);
            i++;
        }

        // Добавляем оставшиеся элементы из массива Z, если таковые имеются
        while (j < z) {
            result.add(Z[j]);
            j++;
        }

        // Преобразуем список в массив
        int[] mergedArray = new int[result.size()];

        for (int k = 0; k < mergedArray.length; k++) {
            mergedArray[k] = result.get(k);
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] Y = {10, 8, 6, 4};
        int[] Z = {9, 7, 5};

        int[] mergedArray = merge(Y, Z);

        // Выводим результат
        System.out.print("Массив после слияния: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
