class LoginTask implements Runnable {

    private String userName;

    public LoginTask(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        try {
            System.out.println(userName + " Login started at: " + System.currentTimeMillis());

            Thread.sleep(2000);

            System.out.println(userName + " Login Successful!");
        } catch (InterruptedException e) {
            System.out.println(userName + " Login Interrupted!");
        }
    }
}
