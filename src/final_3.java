//Финальное задание 3

import java.util.Scanner;
public class final_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double CourseDol = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        double CountRub = scanner.nextDouble();
        System.out.println("Итого долларов: " + Math.round(convert(CourseDol,CountRub)*100.00) / 100.00 + "$");
    }
    static double convert(double CourseDol, double CountRub){
        return CountRub/CourseDol;
    }
}
