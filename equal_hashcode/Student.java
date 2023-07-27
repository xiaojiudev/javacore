package ly.dai.phat.equal_hashcode;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }

        Student otherStudent = (Student) obj;

        if (this.id == otherStudent.id && this.name == otherStudent.name) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return id;
    }
}
