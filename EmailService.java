class EmailService implements Runnable {

    private String customerEmail;

    public EmailService(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public void run() {

        System.out.println("Sending email to " + customerEmail + "...");

        try {
            Thread.sleep(3000); // simulate email delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Email sent successfully to " + customerEmail + " ✅");
    }
}
