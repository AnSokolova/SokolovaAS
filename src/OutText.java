//Задание 16

import java.io.*;

public class OutText {
    public static void main(String[] args) {
        String S;
        try (BufferedReader br = new BufferedReader(new FileReader("OutText.txt"))) {
            while ((S = br.readLine()) != null) {
                System.out.println(S);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода: " + exc);
        }
    }
}