import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = init();
        minimumViableProject(list);
        stretchGoal(list);
    }

    private static ArrayList init() {
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

        return list;
    }

    private static void minimumViableProject (ArrayList<Animals> list) {

//        Sort animals by the year of discovery in descending order
        System.out.println("\nSort by the year of discovery in descending order\n\n\n");

        list.sort((a1, a2) -> a2.getYearDicsovered() - a1.getYearDicsovered());
        list.forEach((animals -> System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered())));

//        Sort by the name in alphabetic order
        System.out.println("\n\n\nSort in alphabetic order by name\n\n\n");

        list.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        list.forEach(animals -> System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered()));

//        Sort by the way they move
        System.out.println("\n\n\nSort by the way they move\n\n\n");

        list.sort((a1,a2) -> a1.move().compareTo(a2.move()));
        list.forEach(animals -> System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered()));

//        List animals that only breathe with lungs
        System.out.println("\n\n\nList animals that only breathe with lungs\n\n\n");

        list.forEach(animals -> {
            if(animals.breathe().equals("lungs"))
                System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered());}  );

//        List animals that only breathe with lungs and were discovered in 1758
        System.out.println("\n\n\nList animals that only breathe with lungs and were discovered in 1758\n\n\n");

        list.forEach(animals -> {
            if(animals.breathe().equals("lungs") && animals.getYearDicsovered() == 1758)
                System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered());}  );

//        List animals that only breathe with lungs and lay eggs
        System.out.println("\n\n\nList animals that only breathe with lungs and lay eggs\n\n\n");

        list.forEach(animals -> {
            if (animals.breathe().equals("lungs") && animals.reproduce().equals("eggs"))
                System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered());}  );

//        Sort alphabetically animals that were discovered in 1758
        System.out.println("\n\n\nSort alphabetically animals that were discovered in 1758\n\n\n");

        list.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        list.forEach(animals -> {
            if (animals.getYearDicsovered() == 1758)
                System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered());
        });
    }

    private static void stretchGoal(ArrayList<Animals> list) {

//        For the list of animals, list alphabetically those animals that are mammals
        System.out.println("\n\n\n***STRETCH GOALS***\nFor the list of animals, list alphabetically those animals that are mammals\n\n\n");

        list.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        list.forEach(animals -> {
            if (animals instanceof Mammals)
                System.out.println("#" + animals.getNumber() + " " + animals.getName() + " : " + animals.getYearDicsovered());
        });

    }
}
