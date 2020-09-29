//Задание 5

import java.util.Scanner;
public class MultiTable {
    public static void f(int val, int mult) {
        System.out.printf("%d x %d = %d\n", val, mult, val * mult);
        if (mult > 1) {
            f(val, mult - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        f(val, 10);
    }
}
