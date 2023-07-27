package ly.dai.phat.interfaceclass.solution;

public class MasterCard implements PaymentGateway {
    public void payment() {
        System.out.println("Payment with Mastercard");
    }
}
