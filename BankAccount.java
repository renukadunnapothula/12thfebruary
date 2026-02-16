
class BankAccount {

    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void transfer(BankAccount target, int amount) {

        synchronized (this) {

            System.out.println(Thread.currentThread().getName()
                    + " locked " + this.name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (target) {

                System.out.println(Thread.currentThread().getName()
                        + " locked " + target.name);

                this.balance -= amount;
                target.balance += amount;

                System.out.println("Transfer completed from "
                        + this.name + " to " + target.name);
            }
        }
    }
}