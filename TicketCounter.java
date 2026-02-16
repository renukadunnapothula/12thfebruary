class TicketCounter {

    private int availableTickets = 10;

    public void bookTickets(String user, int tickets) {

        System.out.println(user + " trying to book " + tickets + " tickets");

        if (availableTickets >= tickets) {

            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets -= tickets;

            System.out.println(user + " successfully booked!");
            System.out.println("Remaining Tickets: " + availableTickets);
        } else {
            System.out.println(user + " Booking Failed ❌ Not enough tickets");
        }

        System.out.println("----------------------------------");
    }
}
