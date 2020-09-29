//Задание 4

import java.util.Scanner;

public class BinaryNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);
        System.out.println(binNum);
    }
}
