package ly.dai.phat.useCollection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSetPractice {
    public static void main(String[] args) {
        /*
        implementation của SortedSet như sau:
            TreeSet
         */

        //Khai báo 1 TreeSet
        SortedSet sortedSet = new TreeSet();
//        TreeSet treeSet = new TreeSet();

        //add(): thêm 1 phần tử
        sortedSet.add("element 1");
        sortedSet.add("element 3");
        sortedSet.add("element 2");

        //remove(): xóa 1 phần tử
//        sortedSet.remove("element 3");

        //first(): lấy phần tử đầu tiên
//        System.out.println(sortedSet.first());

        //last(): lấy phần tử cuối cùng
//        System.out.println(sortedSet.last());

        //duyệt các phần tử Iterator, forEach
//        Iterator iterator = sortedSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }

        //descendingIterator(): sắp xếp giảm dần - *Lưu ý: phương thức này của kiểu dữ liệu <TreeSet>, <SortedSet> không có
//        Iterator iterator = treeSet.descendingIterator();
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }
        //headSet(): lấy các phần tử từ đầu SortedSet đến trước phần tử cho trước
//        SortedSet headSet = sortedSet.headSet("element 3");
//        Iterator iterator1 = headSet.iterator();
//        while (iterator1.hasNext()) {
//            System.out.println((String) iterator1.next()); //=> element 1, element 2
//        }

        //tailSet(): lấy các phần tử từ phần tử cho trước đến phần tử cuối SortedSet
        SortedSet tailSet = sortedSet.tailSet("element 2");
        Iterator iterator1 = tailSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println((String) iterator1.next()); //=> element 2, element 3
        }

    }
}
