package ly.dai.phat.useCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyMapPractice {
    public static void main(String[] args) {
        /*
        implementation của Map như sau:
            HashMap
            HashTable
            LinkedHashMap
            TreeMap
         */

//      Khai báo, với key: integer - value: String
        Map<Integer, String> myMap = new HashMap<>();

//        put(): thêm phần tử
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");

//        get(): lấy ra giá trị của key
//        System.out.println(myMap.get(2));

//        putAll(): thêm phần tử từ map khác
//        Map<Integer, String> myMap2 = new HashMap<>();
//        myMap2.put(4, "four");
//        myMap2.put(5, "five");
//        myMap.putAll(myMap2);

//        remove(): xóa phần tử khỏi map
//        myMap.remove(3);

//        clear(): xóa tất cả phần tử khỏi map
//        myMap.clear();

//        size(): trả về kích thước của map
//        System.out.println(myMap.size());

//        containsKey(): kiểm tra map có chứa key đã tồn tại
//        System.out.println(myMap.containsKey(3));

//        containsValue(): kiểm tra map có chứa value đã tồn tại
//        System.out.println(myMap.containsValue("night"));

//        duyệt các phần tử trong map, dùng entrySet hoặc forEach
//        Iterator<Map.Entry<Integer, String>> itr = myMap.entrySet().iterator();
//        while (itr.hasNext()) {
//            Map.Entry<Integer, String> entry = itr.next();
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//        }
        for (Integer key : myMap.keySet()) {
            System.out.println(myMap.get(key));
        }

    }
}
