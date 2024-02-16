public class CashProvider implements ICashProvider {
    private long card;
    private boolean isAuthorization;

    public boolean buy(int price) {
        return true;
    }

    public boolean repealTicket(int price) {
        return true;
    }

    public void authorization(Customer customer) {

    }
}
