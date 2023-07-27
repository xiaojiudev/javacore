package ly.dai.phat.interfaceclass.solution;

public class AmexCard implements PaymentGateway {
    public void payment() {
        System.out.println("Payment with Amexcard");
    }
}
