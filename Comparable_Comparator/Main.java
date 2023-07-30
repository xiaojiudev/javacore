package ly.dai.phat.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("XiaoJiu", 18));
        studentList.add(new Student("Abc", 17));
        studentList.add(new Student("HJK", 19));

//        comparable
//        Collections.sort(studentList);

//        comparator C1: tạo class mới, ưu điểm có thể tái sử dụng
//        Collections.sort(studentList, new AgeStudentComparator());

//        comparator C2: viết class anonymous
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
