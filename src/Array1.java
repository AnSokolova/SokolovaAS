//Задание 9

import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]*2);
        }
        System.out.println();
    }
}
