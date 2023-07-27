package ly.dai.phat.arraylist;

public class TestMyArrayList {
    static class Person {
        String name;
        int Age;

        Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", Age=" + Age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
//            return super.equals(obj);
            return this.name.equals(((Person) obj).name) && this.Age == ((Person) obj).Age;
        }

        public static void main(String[] args) {
            MyArrayList<Person> myArrayList = new MyArrayList<>(3);
            myArrayList.increaseCapacity(4);
            myArrayList.add(new Person("Nguyễn Văn A", 10));
            myArrayList.add(new Person("Nguyễn Văn B", 20));
            myArrayList.add(new Person("Nguyễn Văn C", 30));
            myArrayList.add(new Person("Nguyễn Văn D", 40));
            MyArrayList<Person> list2 = myArrayList.clone();
            int index = list2.indexOf(new Person("Nguyễn Văn C", 50));
            System.out.println("index = " + index);
            for (int i = 0; i < list2.size(); i++) {
                System.out.println(myArrayList.get(i).toString());
            }
        }
    }
}
