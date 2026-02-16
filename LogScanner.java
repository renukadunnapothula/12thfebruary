class LogScanner extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Scanning logs... Cycle " + i);

            try {
                Thread.sleep(5000); // sleep for 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Scanner interrupted!");
            }
        }

        System.out.println("Log scanning completed ✅");
    }
}
