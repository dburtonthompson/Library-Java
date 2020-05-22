public class GeneralBook extends Book implements Reservable {

    public GeneralBook(String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public int getReserveTime() {
        return 5;
    }

}