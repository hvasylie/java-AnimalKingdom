public abstract class Animals {
    private static int maxId = 0;
    private String name;
    private int number;
    private int yearDicsovered;

    public Animals(String name, int yearDicsovered) {
        this.name = name;
        this.number = ++maxId;
        this.yearDicsovered = yearDicsovered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public int getYearDicsovered() {
        return yearDicsovered;
    }

    public void setYearDicsovered(int yearDicsovered) {
        this.yearDicsovered = yearDicsovered;
    }



    public void eat() {
        System.out.println("Omnomnom");
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
}
