package ly.dai.phat.useCollection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDequePractice {
    public static void main(String[] args) {
        /*
            implementation của Deque như sau:
            LinkedList
            ArrayDeque
         */

//        Khai báo
        Deque<Integer> myDeque = new LinkedList<>();

//        add(), addLast(), offerLast(): thêm ở cuối danh sách
        myDeque.add(1);
        myDeque.addLast(2);
        myDeque.offerLast(3);

//        push(), addFirst(), offerFirst(): thêm ở đầu danh sách
        myDeque.push(4);
        myDeque.addFirst(5);
        myDeque.offerFirst(6);

//        peek(), peekFirst(), getFirst(): truy xuất phần tử đầu danh sách
//        System.out.println(myDeque.peek());
//        System.out.println(myDeque.peekFirst());
//        System.out.println(myDeque.getFirst());

//        peekLast(), getLast(): truy xuất phần tử cuối danh sách
//        System.out.println(myDeque.peekLast());
//        System.out.println(myDeque.getLast());

//        remove(), poll(), removeFirst(), pollFirst(): xóa phần tử đầu danh sách
//        myDeque.remove();
//        myDeque.poll();
//        myDeque.removeFirst();
//        myDeque.pollFirst();

//        removeLast(), pollLast(): xóa phần tử cuối danh sách
//        myDeque.removeLast();
//        myDeque.pollLast();

//        contains(): kiểm tra các phần tử có trong danh sách
        System.out.println(myDeque.contains(7));

//        duyệt qua các phần tử, Iterator, forEach
        Iterator<Integer> itr = myDeque.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
