package ly.dai.phat.arraylist;

import java.util.Arrays;

public class MyArrayList<E> {

    //Số lượng phần tử trong ArrayList
    private int size = 0;

    //Sức chứa mặc định trong ArrayList
    private static final int DEFAULT_CAPACITY = 10;

    //Mảng đối tượng chứa các phần tử trong ArrayList
    private Object[] elements;

    //Phương thức khởi tạo k tham số
    public MyArrayList() {
        System.out.println("Khởi tạo thành công MyArrayList có kích thước là: " + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Phương thức khỏi tạo với kích thước mảng được truyền vào là tham số capacity
    public MyArrayList(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo thành công với kích thước là : " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Tham số không hợp lệ");
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //Phương thức tăng kích thước của mảng chứa phần tử
    public void increaseCapacity(int newCapacity) {
        if (newCapacity >= 0) {
            int newSize = this.elements.length + newCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khởi tạo thành công với kích thước là : " + elements.length);
        } else {
            throw new IllegalArgumentException("newCapacity" + newCapacity);
        }
    }

    //Thêm phần tử vào vị trí index
    public void add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Lỗi index > elements.length" + index);
        } else if (elements.length == index + 1) {
            increaseCapacity(1);
        }

        if (elements[index] == null) {
            size++;
            elements[index] = e;
        } else {
            if (size == elements.length) {
                increaseCapacity(1);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = e;
            size++;
        }
    }

    //Phương thức thêm một phần tử vào cuối ArrayList
    public boolean add(E e) {
        if (size == elements.length) {
            increaseCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    //Phương thức xoá phần tử tại vị trí index
    public E romove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Index không hợp lệ: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    //Phương thức trả về số phần tử trong mảng
    public int size() {
        return size;
    }

    //Phương thức trả về kích thước của MyArrayList
    public int length() {
        return elements.length;
    }

    //Phương thức clone 1 arrayList
    public MyArrayList<E> clone() {
        MyArrayList<E> arrayClone = new MyArrayList<>();

        arrayClone.elements = Arrays.copyOf(elements, size);
        arrayClone.size = size;

        return arrayClone;
    }

    //Phương thức trả về vị trí của 1 phần tử trong Arraylist
    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                index = i;
                break;
            }
        }

        return index;
    }

    //Phương thức trả về phần tử tại vị trí index
    public E get(int index) {
        return (E) elements[index];
    }

    //Phương thức kiểm tra 1 phần tử có tồn tại trong ArrayList hay không
    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    //Phương thức xoá toàn bộ các phần tử trong MyArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
