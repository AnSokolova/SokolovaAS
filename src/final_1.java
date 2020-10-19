//Финальное задание 1

import java.util.Scanner;

public class final_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = sc.nextLine();
        String str = bin;
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (str.charAt(i) - '0') * j;
        }
        System.out.println("Введённое число в десятичном формате: " + n);
    }
}
