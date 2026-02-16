class Customer extends Thread {

    private Account account;
    private String customerName;
    private int amount;

    public Customer(Account account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(customerName, amount);
    }
}
