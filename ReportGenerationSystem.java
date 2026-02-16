public class ReportGenerationSystem {

    public static void main(String[] args) {

        ReportTask sales = new ReportTask("Sales Report");
        ReportTask inventory = new ReportTask("Inventory Report");
        ReportTask profit = new ReportTask("Profit Report");

        Thread t1 = new Thread(sales, "Sales-Thread");
        Thread t2 = new Thread(inventory, "Inventory-Thread");
        Thread t3 = new Thread(profit, "Profit-Thread");

        t1.start();
        t2.start();
        t3.start();

        try {
            
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("All reports completed 🎉");
    }
}
