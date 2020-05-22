public class OverueList<E extends CardHollder> {
    private E overdueBook;

    public OverueList(E overdueBook) {
        this.overdueBook = overdueBook;
    }

    public E getOverdueBook() {
        return this.overdueBook;
    }
}