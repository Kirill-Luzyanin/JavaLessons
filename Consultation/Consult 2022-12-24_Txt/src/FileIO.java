import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/Jk87/IdeaProjects/Java Lessons/Consultation/Consult 2022-12-24_Txt/Output.txt", true));
            //String line = "Hello, Michail, Kirill";
            //writer.write(line);
            //writer.write("\nIt is almost Сhristmas!");
            //writer.newLine(); // разделитель, чтобы перенести в новую строку
            //writer.write("What a wonderful time of the year!");
            writer.append("Privet");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/Jk87/IdeaProjects/Java Lessons/Consultation/Consult 2022-12-24_Txt/Input.txt"));

            // Читает по одной строке:
            //String line1 = reader.readLine();
            //System.out.println(line1);
            //String line2 = reader.readLine();
            //System.out.println(line2);

            //читаем все
            String line = null;
            ArrayList<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                lines.add(line);
            }

            reader.close(); // Закрываем
            System.out.println(lines); // выводим уже массив (array list)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}