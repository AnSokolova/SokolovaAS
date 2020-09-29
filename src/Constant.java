//Задание 7

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int x = 10;
        int y = 20;
        int z = 30;
        if (number == x) {
            System.out.println("Данное значение имеется в константах");
        } else if (number == y) {
            System.out.println("Данное значение имеется в константах");
        } else if (number == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}