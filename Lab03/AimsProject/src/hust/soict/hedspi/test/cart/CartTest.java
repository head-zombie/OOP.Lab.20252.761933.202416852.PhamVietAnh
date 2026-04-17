package AimsProject.src.hust.soict.hedspi.test.cart;

import AimsProject.src.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Attack on titan", "Hajime Isayama", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Science Fiction", "Star Wars", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Naruto", 18.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        System.out.println("\nSearching for DVD with ID 1:");
        cart.searchById(1);

        System.out.println("\nSearching for DVD with ID 3:");
        cart.searchById(3);

        System.out.println("\nSearching for DVD with ID 5:");
        cart.searchById(5);

        System.out.println("\nSearching for DVD with title 'Aladdin':");
        cart.searchByTitle("Aladdin");

        System.out.println("\nSearching for DVD with title 'Attack on titan':");
        cart.searchByTitle("Attack on titan");
    }
}