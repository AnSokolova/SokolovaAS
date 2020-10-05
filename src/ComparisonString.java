//Задание 13

import java.util.Scanner;
public class ComparisonString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String str_1 = scan.nextLine();
        System.out.println("Введите строку 2: ");
        String str_2 = scan.nextLine();
        int len_1 = str_1.length();
        int len_2 = str_2.length();
        if (len_1 > len_2) {
            System.out.println(str_1);
        } else if (len_1 < len_2) {
            System.out.println(str_2);
        } else {
            System.out.println("Строки равны!");
        }
    }
}

