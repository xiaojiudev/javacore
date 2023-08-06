package ly.dai.phat.RegexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    //    tên phải có ít nhất 6 ký tự và dài nhất 12 ký tự
    public static final String REGEX_NAME = "^[a-zA-Z ]{6,12}$";

    //    email abc@lydaiphat.com
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";

    //    số điện thoại
    public static final String REGEX_PHONE_NUMBER = "^84\\d{9}$";

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(REGEX_NAME);
//
//        String input = "Ly Dai Phat";
//        Matcher matcher = pattern.matcher(input);
//        System.out.println(matcher.matches());

//        Pattern pattern1 = Pattern.compile(REGEX_EMAIL);
//
//        String input1 = "ldphat99@gmail.com.vn";
//        Matcher matcher1 = pattern1.matcher(input1);
//        System.out.println(matcher1.matches());

        Pattern pattern2 = Pattern.compile(REGEX_PHONE_NUMBER);

        String input2 = "84326423996";
        Matcher matcher2 = pattern2.matcher(input2);
        System.out.println(matcher2.matches());
    }
}
