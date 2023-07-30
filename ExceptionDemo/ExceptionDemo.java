package ly.dai.phat.ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

//    public static void print() {
//        print();
//    }

    public static void main(String[] args) throws FileNotFoundException {
//        int zero = 0;
//        int result = 10 / zero;
//        System.out.println("Result: " + result);
//        exception này chỉ xảy ra lỗi khi chạy chương trình => runtime => unchecked

//        FileReader f = new FileReader("filename.json");
//        khi gọi tới này, java sẽ báo là unhandled exception này => xảy ra lúc viết code (compile time) => checked

//        print();
//        Lỗi vùng nhớ bị tràn => không có cách xử lý, lỗi do cá nhân

//        FileReader f = new FileReader("filename.json");
//        C1: dùng throws FileNotFoundException, khi có lỗi sẽ ném cho class khác xử

//        C2: dùng try catch
        try {
            int zero = 0;
            int result = 10 / zero;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Chương trình kết thúc");
        }

    }
}
