package ly.dai.phat.AccessModifier.package1;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();

//        person.name = "phát"; error because name variable is private
        person.age = 18;
        person.job = "Web development";
        person.isSingle = true;

    }
}
