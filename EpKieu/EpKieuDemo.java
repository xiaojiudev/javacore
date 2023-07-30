package ly.dai.phat.EpKieu;

public class EpKieuDemo {
    public static void main(String[] args) {

        //ép kiểu student về person
        Person person = new Student();

        person.setName("Xiao Jiu");
        ((Student) person).setClassroom("17T3A1");

        System.out.println(person.getName());
        System.out.println(((Student) person).getClassroom());

        //do person, teacher cùng kiểu Person, nên có thể gán được giá trị cho nhau
        Person teacher = new Teacher();
        teacher = person;

        System.out.println(teacher.getName());

//        Student student = new Student();
//        Teacher teacher = new Teacher();
//        không gán được teacher = person, cho dù có ép kiểu ntn đi nữa, do 2 class này không giống nhau ở điểm nào
    }
}
