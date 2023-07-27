package ly.dai.phat.useCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueuePractice {
    public static void main(String[] args) {
        /*
            implementation của Queue như sau:
                LinkedList
                PriorityQueue
                ArrayDeque
         */
//        Khai báo
        Queue<String> myQueue = new LinkedList<>();

//        add(), offer(): thêm phần tử
        myQueue.add("a");
        myQueue.offer("b");

//        peek(), element(): lấy ra phần tử ở đầu hàng đợi
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.element());

//        poll(), remove(): lấy phần tử đầu hàng đợi và xóa nó
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.remove());

//        clear(): xóa tất cả phần tử trong hàng đợi
//        myQueue.clear();

//        isEmpty(): kiểm tra hàng đợi có rỗng hay không
//        System.out.println(myQueue.isEmpty());

//        contains(): kiểm tra phần tử đã có trong hàng đợi
//        System.out.println(myQueue.contains("b"));


//        size(): kiểm tra kích thước của hàng đợi
//        System.out.println(myQueue.size());

//        duyệt các phần tử trong hàng đợi forEach, Iterator
//        for (String element : myQueue) {
//            System.out.println(element);
//        }

        Iterator<String> queueIterator = myQueue.iterator();
        while (queueIterator.hasNext()) {
            System.out.println(queueIterator.next());
        }

    }
}
