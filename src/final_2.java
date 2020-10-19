//Финальное задание 2

import java.util.Arrays;
import java.util.Scanner;

public class final_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        selectionSort(array);
    }
    public static void selectionSort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minId = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }
        System.out.print ("Отсортированный массив: " + Arrays.toString(array));
    }
}

