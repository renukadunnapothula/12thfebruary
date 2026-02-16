class ReportTask implements Runnable {

    private String reportName;

    public ReportTask(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public void run() {
        try {
            System.out.println(reportName + " generation started by "
                    + Thread.currentThread().getName());

            Thread.sleep(2000);

            System.out.println(reportName + " generation completed ✅");

        } catch (InterruptedException e) {
            System.out.println(reportName + " interrupted!");
        }
    }
}
