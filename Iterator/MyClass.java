package ly.dai.phat.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        Collections.addAll(myList, 2, 6, 3, 1, 8, 9);
        System.out.println(myList.toString());
        
        Iterator<Integer> iterator = myList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element <= 3) {
                iterator.remove();
            }
        }

        System.out.println(myList.toString());
    }
}
