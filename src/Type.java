//Задание 14

import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("Строковая переменная: " + S);
        System.out.println("Числовая переменная типа int: " + X);
        System.out.println("Числовая переменная типа double: " + Y);
    }
}
