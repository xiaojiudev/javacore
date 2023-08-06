package ly.dai.phat.AccessModifier.package2;

import ly.dai.phat.AccessModifier.package1.Person;

public class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.job = "Fullstack developer"; //can access job variable, because Student extends from Person.
        student.isSingle = true;
    }

}
