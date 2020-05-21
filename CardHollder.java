public class CardHollder {
    private String name;
    private int yearJoined;

    public CardHollder(String name, int yearJoined) {
        this.name = name;
        this.yearJoined = yearJoined;
    }

    public String getName() {
        return name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
}