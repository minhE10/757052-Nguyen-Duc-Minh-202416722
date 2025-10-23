package hust.soict.dsai.aims;
import java.util.ArrayList;
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED=20; 
	private int qtyOrdered=0;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);
	
	public String checkcart() {
		if (qtyOrdered==20) {
			return "Cart is full";
		}
		else if (qtyOrdered==0) {
			return "Cart is empty";
		}
		else {
			return "Avaiable";
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (checkcart()=="Cart is full") {
			System.out.println("Cannot add more DVD");
		}
		else {
			itemsOrdered.add(dvd);
			qtyOrdered++;
			System.out.println("Added: "+ dvd.getTitle());
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (checkcart()=="Cart is empty") {
			System.out.println("Cannot remove dvd");
		}
		else {
			itemsOrdered.remove(disc);
			qtyOrdered--;
			System.out.println("Removed: "+ disc.getTitle());
		}
	}
	public float totalCost() {
		float total=0f;
		for (int i=0; i<itemsOrdered.size(); i++) {
			total+=itemsOrdered.get(i).getCost();
		}
		return total;
	}
	public void printCart() {
	    if (qtyOrdered == 0) {
	        System.out.println("Your cart is empty.");
	        return;
	    }
	    System.out.println("\n***** CART CONTENT *****");
	    for (int i = 0; i < itemsOrdered.size(); i++) {
	        DigitalVideoDisc dvd = itemsOrdered.get(i);
	        System.out.println((i + 1) + ". " + dvd.getTitle() 
	            + " - Category: " + dvd.getCategory() 
	            + " - Cost: " + dvd.getCost());
	    }
	    System.out.println("Total cost: " + totalCost());
	    System.out.println("************************");
	}

	public void removeDVDbyNumber(int number) {
	    if (qtyOrdered == 0) {
	        System.out.println("Your cart is empty.");
	        return;
	    }
	    if (number < 1 || number > qtyOrdered) {
	        System.out.println("Invalid number.");
	        return;
	    }
	    DigitalVideoDisc removed = itemsOrdered.remove(number - 1);
	    qtyOrdered--;
	    System.out.println("Removed: " + removed.getTitle());
	}

	public int getQtyOrdered() {
	    return qtyOrdered;
	}

}
