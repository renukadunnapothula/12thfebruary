class Inventory {

    private int stock = 100;

    public void updateStock(String user, int quantity) {

        // Logging (Not synchronized)
        System.out.println(user + " is trying to update stock by " + quantity);

        // Critical section (synchronized block)
        synchronized (this) {

            if (stock + quantity >= 0) {

                System.out.println(user + " updating stock...");

                try {
                    Thread.sleep(2000); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                stock += quantity;

                System.out.println(user + " updated stock successfully ✅");
                System.out.println("Current Stock: " + stock);
            } else {
                System.out.println("Stock cannot go negative ❌");
            }
        }

        // Logging (Not synchronized)
        System.out.println(user + " update process finished.");
        System.out.println("---------------------------------");
    }
}
