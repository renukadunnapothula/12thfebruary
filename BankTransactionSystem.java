public class BankTransactionSystem {

    public static void main(String[] args) {

        Account sharedAccount = new Account();

        Customer c1 = new Customer(sharedAccount, "Customer-1", 3000);
        Customer c2 = new Customer(sharedAccount, "Customer-2", 3000);
        Customer c3 = new Customer(sharedAccount, "Customer-3", 2000);

        c1.start();
        c2.start();
        c3.start();
    }
}
