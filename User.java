class User extends Thread {

    private TicketCounter counter;
    private String userName;
    private int tickets;

    public User(TicketCounter counter, String userName, int tickets) {
        this.counter = counter;
        this.userName = userName;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        counter.bookTickets(userName, tickets);
    }
}
