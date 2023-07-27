package ly.dai.phat.abstractionclass.solution;

public class Main {
    public static void main(String[] args) {
//      Order order = new Oder(); error
        OnlineOrder onlineOrder = new OnlineOrder();

        onlineOrder.validate();
        onlineOrder.process();

        StoreOrder storeOrder = new StoreOrder();

        storeOrder.validate();
        storeOrder.process();

    }
}
