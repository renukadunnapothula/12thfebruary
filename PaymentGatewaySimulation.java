public class PaymentGatewaySimulation {

    public static void main(String[] args) {

        Thread p1 = new Thread(new PaymentTask("Payment-1"), "Thread-1");
        Thread p2 = new Thread(new PaymentTask("Payment-2"), "Thread-2");
        Thread p3 = new Thread(new PaymentTask("Payment-3"), "Thread-3");

        p1.start();
        p2.start();
        p3.start();
    }
}
