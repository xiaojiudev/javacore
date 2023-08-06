package ly.dai.phat.AccessModifier.package2;

import ly.dai.phat.AccessModifier.package1.Person;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();

//        person.age = 18; error because age variable is default in package1
//        person.job = "Fullstack developer"; error because job variable is protected, not in the same package just only access in child
        person.isSingle = true;
    }
}
