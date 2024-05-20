package com.example.loading.task7;

public class SortTest {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int[] arr, int low, int high){

        if(low < high){
            int pivot = partition(arr, low, high);
            // Рекурсивно вызываем функцию quickSort для левой и правой части массива (от low до pi - 1 и от pi + 1 до high).
            quickSort(arr, low, pivot -1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1; // начало массива
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){ // если элемент меньше опорного

                i++; // двигаемся дальше от начала массива
                int temp = arr[i]; // меняем местами сдвинутый элемент с начала массива и соседний элемент
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        // меняем элементы так, чтоб все элементы меньше опорного были слева от него, а больше - справа
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }
}
