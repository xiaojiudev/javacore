package ly.dai.phat.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyClass {
    public static void main(String[] args) {
//        ngày tháng năm: sử dụng lớp LocalDate
//        now: lấy ngày tháng năm hiện tại
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

//        giờ phút giây: sử dụng lớp LocalTime
//        now: lấy giờ phút giây hiện tại
        LocalTime myobj2 = LocalTime.now();
        System.out.println(myobj2);

//        ngày tháng năm giờ phút giây: sử dụng lớp LocalDateTime
        LocalDateTime myobj3 = LocalDateTime.now();
        System.out.println("Before formatting: " + myobj3);

//        thay đổi cách hiển thị: sử dụng lớp DateTimeFormatter
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myFormat.format(myobj3);
        System.out.println("After formatting: " + formattedDate);
    }
}
