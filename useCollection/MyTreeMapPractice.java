package ly.dai.phat.useCollection;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMapPractice {
    public static void main(String[] args) {
        /*
            TreeMap không chứa key null
            key được sắp xếp (mặc định tăng dần)
            Ở đây ví dụ vài phương thức, các phương thức khác tương tự HashMap
         */
//        Khai báo
        Map<Integer, String> myTreeMap = new TreeMap<>();
//        put(): thêm phần tử, cập nhật lại giá trị của key
        myTreeMap.put(2, "two");
        myTreeMap.put(1, "one");
        myTreeMap.put(3, "three");

//        get(): truy cập phần tử
//        System.out.println(myTreeMap.get(3));

//        put(): cập nhật lại giá trị của key
//        myTreeMap.put(3, "new value");

//        remove(): xóa 1 phần tử
        myTreeMap.remove(3);


//        duyệt các phần tử entrySet, forEach
        for (Map.Entry<Integer, String> entry : myTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
