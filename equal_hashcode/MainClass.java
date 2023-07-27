package ly.dai.phat.equal_hashcode;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(1, "Nguyễn Văn A");

//        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());


        Set<Student> studentSet = new HashSet<>();

        studentSet.add(student1);
        studentSet.add(student2);

        for (Student e : studentSet) {
            System.out.println(e);
        }
    }
}
