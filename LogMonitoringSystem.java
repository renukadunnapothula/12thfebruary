public class LogMonitoringSystem {

    public static void main(String[] args) throws InterruptedException {

        LogScanner scanner = new LogScanner();

        // State before start
        System.out.println("Before start(): " + scanner.getState());

        scanner.start();

        // Monitor state periodically
        while (scanner.isAlive()) {

            System.out.println("Current State: " + scanner.getState());

            Thread.sleep(2000); // check every 2 seconds
        }

        // Final state
        System.out.println("After completion: " + scanner.getState());
    }
}
