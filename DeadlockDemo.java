public class DeadlockDemo {

    public static void main(String[] args) {

        BankAccount accA = new BankAccount("Account-A", 5000);
        BankAccount accB = new BankAccount("Account-B", 5000);

        Thread t1 = new Thread(() -> {
            accA.transfer(accB, 1000);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            accB.transfer(accA, 2000);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
