public class Customer {
    private int id;
    private Ticket[] tickets;
    private ICashProvider cashProvider;

    public boolean buyTicket(Ticket ticket) {
        return true;
    }

    public boolean repealTicket(Ticket ticket) {
        return true;
    }

    public Ticket[] searchTicket(int rootNumber) {
        return null;
    }
}
