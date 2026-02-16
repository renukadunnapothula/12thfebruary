public class EmailNotificationSystem {

    public static void main(String[] args) {

        System.out.println("Order processing started...");

        // Simulate order processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order placed successfully ✅");

        // Start email in background
        Thread emailThread = new Thread(
                new EmailService("customer@gmail.com"));

        emailThread.start();

        // Confirmation prints immediately
        System.out.println("Order confirmation displayed to user 🎉");
    }
}
