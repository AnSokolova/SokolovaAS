import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве: ");
        int line = input.nextInt();
        System.out.println("Введите количество столбцов в массиве: ");
        int column = input.nextInt();
        int[][] NMatrix = new int[line][column];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                NMatrix[i][j] = input.nextInt();
            }
        }
        System.out.print("Первая строка полученной матрицы:");
        for (int i = 0; i<1; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + NMatrix[i][j]*3 + " ");
            }
        }
    }
}



