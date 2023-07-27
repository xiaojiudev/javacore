package ly.dai.phat.useCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyListPractice {
    public static void main(String[] args) {
        //Khai báo
        List<String> myList1 = new ArrayList<>();

        //add(): thêm phần tử
        myList1.add("Hello World");
        myList1.add("XiaoJiu developer");
        myList1.add("Spring Boot");

        //size(): tổng số phần tử của tập hợp
//        System.out.println(myList1.size());


        //addAll(): thêm các phần tử từ các collection có sẵn
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("This is list2");
//        myList2.add("This is list2 again");
//        myList1.addAll(myList2);


//        get(): lấy giá trị phần tử tại vị trí index
//        System.out.println(myList1.get(2));


//        set(): cập nhật lại giá trị phần tử
//        myList1.set(2, "Spring Boot => C#.NET");
//        System.out.println(myList1.get(2));


//        indexOf(): trả về index của vị trí phần tử cần tìm
//        System.out.println(myList1.indexOf("Spring Boot"));

//        lastIndexOf(): trả về index cuối cùng của phần tử cần tìm
//        System.out.println(myList1.lastIndexOf("Spring Boot"));

//        remove(): xóa phần tử khỏi danh sách
//        myList1.remove(2);
//        myList1.remove("Spring Boot");

//        clear(): xóa toàn bộ phần tử trong tập hợp
//        myList1.clear();

//        contains(): kiểm tra phần tử cần tìm có trong tập hợp hay k
//        System.out.println(myList1.contains("Spring Boot"));

//        sublist(): tạo tập hợp mới từ tập hợp cho trước
//        List<String> newList = myList1.subList(1, 2);


//        toArray(): chuyển ArrayList thành tập hợp Array
//        myList1.toArray();

//        asList(): chuyển Array thành ArrayList
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        List<String> list = Arrays.asList(cars);

//        Duyệt và in phần tử
        for (String element : myList1) {
            System.out.println(element);
        }
    }
}
