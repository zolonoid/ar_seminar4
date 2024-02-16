public interface ICashProvider {
    boolean buy(int price);
    boolean repealTicket(int price);
    void authorization(Customer customer);
}
