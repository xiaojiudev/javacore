package ly.dai.phat.GenericsPractice;

public class GenericsExample1 {

    //    cách viết thông thường, không hạn chế kiểu dữ liệu
//    public static void printElement(Object[] objects) {
//        for (Object o : objects) {
//            System.out.print(o + " ");
//        }
//        System.out.println();
//    }
//    T object_t;
//    Object object;


//    public GenericsExample1() {
////        object_t = new T(); compile error
//        object = new Object();
//    }

    //    private static T object; compile error
//    private T object2;

//    public static T getObject() { compile error
//        return object;
//    }

//    public T getObject2() {
//        return object2;
//    }

    public static <T> void printElementWithGenerics1(T[] t) {
        for (T o : t) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] myArrInt = {1, 2, 3, 4};
        Double[] myArrDouble = {1.1, 2.2, 3.3, 4.4};
        String[] myArrStr = {"A", "B", "C", "D"};

//        printElement(myArrInt);
//        printElement(myArrDouble);
//        printElement(myArrStr);

        printElementWithGenerics1(myArrInt);

    }
}
