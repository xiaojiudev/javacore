package ly.dai.phat.FileIOPractice;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String FILE_NAME = "src/main/java/ly/dai/phat/FileIOPractice/student.csv"; //file csv dữ liệu cùng 1 dòng ngăn cách bởi dấu phẩy
    public static final String COMMA = ",";

    public static void main(String[] args) {

//        Output file
//        Student student1 = new Student(1, "Sau", "09/07/2003");
//        Student student2 = new Student(1, "XiaoJiu", "09/12/1999");
//        Student student3 = new Student(1, "John", "7/07/2022");
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//
//        String line = null;
//        for (Student student : studentList) {
//            line = student.getId() + COMMA + student.getName() + COMMA + student.getDateOfBirth();
//            FileUtils.writeFile(FILE_NAME, line);
//        }

//        Input file
        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);

//        System.out.println(listLine.get(0));
        String[] lineSplit = listLine.get(0).split(COMMA);
//        for (String e : lineSplit) {
//            System.out.println(e);
//        }

        Student student4 = new Student(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2]);

        System.out.println(student4.getId() + " " + student4.getName() + " " + student4.getDateOfBirth());
    }
}
