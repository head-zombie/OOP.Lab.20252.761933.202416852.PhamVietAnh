package AimsProject;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Science Fiction", "Star Wars", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladdin", 18.99f);

        System.out.println("Adding DVDs to the store...");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        System.out.println("\nCurrent DVDs in the store:");
        store.printStore();

        System.out.println("\nRemoving a DVD from the store...");
        store.removeDVD(dvd2);

        System.out.println("\nCurrent DVDs in the store after removal:");
        store.printStore();

        System.out.println("\nAttempting to remove a DVD not in the store...");
        store.removeDVD(dvd2);
    }
}
