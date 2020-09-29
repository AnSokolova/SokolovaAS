//Задание 6

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Введите три числа x, y, z поочереди: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int ar[] = {x, y, z};
        int a = ar.length;
        int res = (ar[0] + ar[1] + ar[2]) / a;
        double res2 = Math.floor(res / 2);
        if (res2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}