package ly.dai.phat.GenericsPractice;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample2 {

    public static void printElement(List<?> list) {
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }

    public static void printElement1(List<? extends String> list) {
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> myListInt = new ArrayList<>();
        myListInt.add(1);
        myListInt.add(2);

        List<Double> myListDouble = new ArrayList<>();
        myListDouble.add(1.1);
        myListDouble.add(1.2);

        List<String> myListStr = new ArrayList<>();
        myListStr.add("A");
        myListStr.add("B");

        printElement(myListInt);
        printElement(myListDouble);
        printElement(myListStr);

//        printElement1(myListInt);     error
        printElement1(myListStr);
    }
}
