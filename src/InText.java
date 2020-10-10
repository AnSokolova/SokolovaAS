//Задание 17

import java.io.*;

public class InText {
    public static void main(String[] args) {
        String S;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Признак конца ввода строка - 'стоп' ");
    try (FileWriter fw = new FileWriter("C:\\Users\\Аня\\Desktop\\outTest.txt")){
        do {
            System.out.print(": ");
            S = br.readLine();
            if (S.compareTo("стоп") == 0) break;
            S = S + "\r\n";
            fw.write(S);
        }
        while (S.compareTo("стоп") != 0);
        }
    catch (IOException exc) {
        System.out.println("Ошибка ввода вывода: " + exc);
        }
    }
}
