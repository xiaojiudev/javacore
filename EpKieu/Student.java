package ly.dai.phat.EpKieu;

public class Student extends Person {
    private String classroom;

    public Student() {
        
    }

    public Student(String classroom) {
        this.classroom = classroom;
    }

    public Student(String name, String classroom) {
        super(name);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
