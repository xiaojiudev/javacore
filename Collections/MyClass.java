package ly.dai.phat.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

//        addAll(): thêm 1 hoặc nhiều phần tử vào tập hợp
        Collections.addAll(myList, 2, 1, 7, 4, 9);
        System.out.println(myList.toString());

//        sort(): sắp xếp phần tử của tập hợp
        Collections.sort(myList);
        System.out.println(myList.toString());

//        binarySearch(): tìm kiếm nhị phân, chỉ dùng khi tập hợp đã được sắp xếp
//        System.out.println(Collections.binarySearch(myList, 4));

//        reverse(): đảo ngược các phần tử trong tập hợp
//        Collections.reverse(myList);
//        System.out.println(myList.toString());

//        shuffle(): xáo trộn các phần tử trong tập hợp
//        Collections.shuffle(myList);
//        System.out.println(myList.toString());
//        Collections.shuffle(myList);
//        System.out.println(myList.toString());

//        replaceAll(): thay thế phần tử trong tập hợp bằng 1 phần tử mới
        Collections.replaceAll(myList, 1, 100);
        System.out.println(myList.toString());
    }
}
