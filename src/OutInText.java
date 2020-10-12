//Задание 18

import java.io.*;

public class OutInText {
    public static void main(String[] args) {
        String OutS;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Аня\\Desktop\\Test.txt"))) {
            while ((OutS = br.readLine()) != null) {
                System.out.println(OutS);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода: " + exc);
        }
        String InS;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("C:\\Users\\Аня\\Desktop\\Test.txt")){
            do {
                System.out.print(": ");
                InS = br.readLine();
                OutS = br.readLine();
                if (InS.length() == OutS.length()) break;
                InS = InS + "\r\n";
                fw.write(InS);
            }
            while (InS.length() != OutS.length());
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода вывода: " + exc);
        }
    }
}