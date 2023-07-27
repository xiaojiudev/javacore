package ly.dai.phat.useCollection;

import java.util.Iterator;
import java.util.Stack;

public class MyStackPractice {
    public static void main(String[] args) {
//        Khai báo
        Stack<Integer> myStack = new Stack<>();

//        push(): thêm phần tử ở đầu stack
        myStack.push(1); // => đáy stack
        myStack.push(2);
        myStack.push(3);
        myStack.push(4); // => đỉnh stack

//        peek(): trả về phần tử đầu stack
//        System.out.println(myStack.peek());

//        pop(): lấy phần tử đầu stack và xóa nó khỏi stack
//        System.out.println(myStack.pop());

//        search(): trả về vị trí của phần tử cần tìm, tính từ đỉnh stack (vị trí = index + 1)
//        System.out.println(myStack.search(1));

//        size(): trả về kích thước stack
//        System.out.println(myStack.size());

//        duyệt qua các phần tử của stack, Iterator, forEach
        Iterator<Integer> stackIterator = myStack.iterator();
        while (stackIterator.hasNext()) {
            System.out.println(stackIterator.next());
        }
    }
}
