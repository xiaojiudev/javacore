package ly.dai.phat.interfaceclass.solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter payment type: ");

        PaymentGateway paymentGateway;

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        if (inputString.equals("Visa")) {
            paymentGateway = new VisaCard();
        } else if (inputString.equals("Master")) {
            paymentGateway = new MasterCard();
        } else {
            paymentGateway = new AmexCard();
        }

        paymentGateway.payment();
    }
}
