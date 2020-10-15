//Задание 18

import java.io.*;

public class OutInText {
    public static void main(String[] args) {
        String OutS;
        String InS;
        try{
            BufferedReader br = new BufferedReader(new FileReader("OutInText.txt"));
            while ((OutS = br.readLine()) != null) {
                System.out.println(OutS);
            }
            LineNumberReader lineNumberReader = new LineNumberReader(br);
            int Outlines = 0;
            while (lineNumberReader.readLine() != null){
                Outlines++;
            }
            System.out.println(Outlines);
            lineNumberReader.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("OutInText.txt");
            for (int i=0; i <= Outlines; i++){
                System.out.print(": ");
                InS = bufferedReader.readLine();
                InS = InS + "\r\n";
                fw.write(InS);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода вывода: " + exc);
        }
    }
}