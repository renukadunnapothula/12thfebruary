public class TicketBookingSystem {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        User u1 = new User(counter, "User-1", 4);
        User u2 = new User(counter, "User-2", 4);
        User u3 = new User(counter, "User-3", 4);
        User u4 = new User(counter, "User-4", 4);
        User u5 = new User(counter, "User-5", 4);

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
    }
}
