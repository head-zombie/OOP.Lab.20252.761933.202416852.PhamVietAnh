package AimsProject;

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
    }
}