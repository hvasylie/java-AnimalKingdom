import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public void minimumViableProject () {
        ArrayList<Animals> list = new ArrayList<>();

        list.add(new Mammals("Panda", 1869));
        list.add(new Mammals("Zebra", 1778));
        list.add(new Mammals("Koala", 1816));
        list.add(new Mammals("Sloth", 1804));
        list.add(new Mammals("Armadillo", 1758));
        list.add(new Mammals("Racoon", 1758));
        list.add(new Mammals("Bigfoot", 2021));

        list.add(new Birds("Pigeon", 1837));
        list.add(new Birds("Peacock", 1821));
        list.add(new Birds("Toucan", 1758));
        list.add(new Birds("Parrot", 1824));
        list.add(new Birds("Swan", 1758));

        list.add(new Fish("Salmon", 1758));
        list.add(new Fish("Catfish", 1817));
        list.add(new Fish("Perch", 1758));

        list.sort((a1, a2) -> a1.getYearDicsovered() - a2.getYearDicsovered());
        list.forEach((animals -> System.out.println(animals)));

    }
}
