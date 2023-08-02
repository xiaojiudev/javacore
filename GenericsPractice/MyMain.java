package ly.dai.phat.GenericsPractice;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList();

        myArray.add(1);
//        myArray.add("hello world");               error
//        myArray.add(true);                        error

        int number = myArray.get(0);
//        String str = (String) myArray.get(1);     error
//        Boolean bl = (Boolean) myArray.get(2);    error
    }
}
