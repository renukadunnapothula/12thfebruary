public class OrderProcessingSystem {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            Order order = new Order(i);

            Thread thread = new Thread(order);

            thread.setName("Order-Thread-" + i);

            thread.start();
        }
    }
}
