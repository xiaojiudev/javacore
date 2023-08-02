package ly.dai.phat.FileIOPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line); //ghi ra file
            bufferedWriter.newLine();   //tạo dòng mới

            bufferedWriter.close(); //thao tác xong nhớ đóng file lại thì file mới lưu lại
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFile(String pathFile) {

        List<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listLine;
    }
}
