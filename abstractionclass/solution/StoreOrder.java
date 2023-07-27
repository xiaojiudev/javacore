package ly.dai.phat.abstractionclass.solution;

public class StoreOrder extends Order {
    //Store ID is need, We don't need warehouse id
    private long storeId;
//    private Employee storeRep;

    @Override
    public void validate() {
        //only validation for Store type don't need if else
        System.out.println("Store Order is validation");
    }

    @Override
    public void process() {
        //only validation for Store type don't need if else
        System.out.println("Store Order is process");
    }
}
