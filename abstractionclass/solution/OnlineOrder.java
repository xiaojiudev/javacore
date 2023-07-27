package ly.dai.phat.abstractionclass.solution;

public class OnlineOrder extends Order {
    private String couponCode;

    @Override
    public void validate() {
        //only validation for Online type don't need if else
        System.out.println("Online Order is validation");
    }

    @Override
    public void process() {
        //only validation for Online type don't need if else
        System.out.println("Online Order is process");
    }
}
