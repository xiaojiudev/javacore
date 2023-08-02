package ly.dai.phat.GenericsPractice;

public class MyMap<K, V> {

    private K key;
    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {

        MyMap<Integer, String> myMap_1 = new MyMap(1, "one");
        MyMap<String, Integer> myMap_2 = new MyMap("two", 2);

        System.out.println(myMap_1.getKey() + " " + myMap_1.getValue());
        System.out.println(myMap_2.getKey() + " " + myMap_2.getValue());
    }
}
