package ly.dai.phat.useCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySetPractice {
    public static void main(String[] args) {
        /*
    implements của Set như sau:
        HashSet
        LinkedHashSet
        TreeSet
        EnumSet
     */

        //    khai báo 1 set
        Set<String> mySet = new HashSet<>();

        //add(): thêm phần tử
        mySet.add("element 1");
        mySet.add("element 2");
        mySet.add("element 3");

        //addAll(): thêm các phần tử từ một tập hợp khác vào trong Set, ngoài ra có thể conver Set thành List
//        Set<String> mySet2 = new HashSet<>();
//        mySet2.add("element 4 in set 2");
//        mySet2.add("element 5 in set 2");
//        mySet.addAll(mySet2);

        //size(): kiểm tra kích thước của tập hợp
//        System.out.println(mySet.size());

        //isEmpty(): kiểm tra Set có rỗng hay không
//        System.out.println(mySet.isEmpty());

        //contains(): kiểm tra một phần tử có tồn tại trong Set hay chưa
//        System.out.println(mySet.contains("element 3"));

        //duyệt các phần tử bằng Iterator, forEach
//        for (String element : mySet) {
//            System.out.println(element);
//        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
