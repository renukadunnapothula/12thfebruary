class Account {

    private int balance = 5000;

    // synchronized method
    public synchronized void withdraw(String customerName, int amount) {

        System.out.println(customerName + " is trying to withdraw ₹" + amount);

        if (balance >= amount) {

            System.out.println(customerName + " withdrawal in process...");

            try {
                Thread.sleep(2000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println(customerName + " withdrawal successful ✅");
            System.out.println("Remaining Balance: ₹" + balance);

        } else {
            System.out.println(customerName + " Insufficient Balance ❌");
        }

        System.out.println("---------------------------------");
    }
}
