class Order implements Runnable {

    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +
                    " → Order " + orderId + " Validation Started");

            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() +
                    " → Order " + orderId + " Payment Processing");

            Thread.sleep(1500);

            System.out.println(Thread.currentThread().getName() +
                    " → Order " + orderId + " Completed ✅");

        } catch (InterruptedException e) {
            System.out.println("Order Interrupted!");
        }
    }
}
