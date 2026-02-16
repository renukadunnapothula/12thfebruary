import java.util.Random;

class PaymentTask implements Runnable {

    private String paymentId;

    public PaymentTask(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public void run() {

        Random random = new Random();
        int delay = (random.nextInt(3) + 1) * 1000; // 1–3 seconds

        System.out.println(paymentId + " Payment started by "
                + Thread.currentThread().getName());

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(paymentId + " Payment completed in "
                + (delay / 1000) + " seconds ✅");
        System.out.println("------------------------------------");
    }
}
