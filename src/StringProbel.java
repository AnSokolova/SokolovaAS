// Задание 12

import java.util.Scanner;
public class StringProbel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку с пробелами: ");
        String str = scan.nextLine();
        String strPro = str.replaceAll(" ", "");
        System.out.println("Ваша строка без пробелов: ");
        System.out.println(strPro);
    }
}
