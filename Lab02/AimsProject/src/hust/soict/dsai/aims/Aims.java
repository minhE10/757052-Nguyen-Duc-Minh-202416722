package hust.soict.dsai.aims;
import java.util.Scanner;
import java.util.ArrayList;

public class Aims {
    private static ArrayList<DigitalVideoDisc> store = new ArrayList<>();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initStore();
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            handleChoice(choice);
        } while (choice != 4);

        scanner.close();
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                displayStore();
                System.out.print("Enter the number of the DVD to add to cart: ");
                int addChoice = scanner.nextInt();
                if (addChoice > 0 && addChoice <= store.size()) {
                    cart.addDigitalVideoDisc(store.get(addChoice - 1));
                } else {
                    System.out.println("Invalid number.");
                }
                break;
            case 2:
                cart.printCart();
                if (cart.getQtyOrdered() > 0) { 
                    System.out.print("Enter the number of the DVD to remove from your cart: ");
                    int removeChoice = scanner.nextInt();
                    cart.removeDVDbyNumber(removeChoice);
                }
                break;
            case 3:
                cart.printCart();
                break;
            case 4:
                System.out.println("Exiting the application.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }
    
    public static void showMenu() {
        System.out.println("\n--- DVD Store Menu ---");
        System.out.println("1. Add a DVD to cart");
        System.out.println("2. Remove a DVD from cart");
        System.out.println("3. See current cart");
        System.out.println("4. Exit");
        System.out.println("----------------------");
        System.out.print("Please choose a number: ");
    }
    public static void displayStore() {
        System.out.println("\n--- Available DVDs in Store ---");
        for (int i = 0; i < store.size(); i++) {
            DigitalVideoDisc dvd = store.get(i);
            System.out.println((i + 1) + ". " + dvd.getTitle() + " - Cost: " + dvd.getCost());
        }
        System.out.println("-----------------------------");
    }
    public static void initStore() {
        store.add(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.add(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f));
        store.add(new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f));
        store.add(new DigitalVideoDisc("The Matrix", "Action", "Wachowskis", 136, 15.50f));
        store.add(new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 22.75f));
        store.add(new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 12.99f));
        store.add(new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 14.00f));
        store.add(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 17.50f));
        store.add(new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 21.00f));
        store.add(new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 25.00f));
    }
}