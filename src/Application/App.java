public class App {
    public static void main(String args[]) throws IndiceInferieurException {

        RangeArray<String> habitations = new RangeArray<>(3, 5);
        System.out.println(habitations.rangeSize());
        habitations.set(3, "Maison");
        habitations.set(4, "Immeuble");
        habitations.set(5, "Hutte");
    }
}
