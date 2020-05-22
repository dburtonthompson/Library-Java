public interface Loanable {
    boolean isLoanable();

    int getLoanDays();

    default float getLateCharge() {
        return 3.50f;
    }
}