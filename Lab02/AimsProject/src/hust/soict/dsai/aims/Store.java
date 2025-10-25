package hust.soict.dsai.aims;

import java.util.ArrayList;

public class Store {
	private ArrayList<DigitalVideoDisc>  itemsInStore  = new ArrayList<>();

	public void addDVD(DigitalVideoDisc dvd) {
		 itemsInStore.add(dvd);
		 System.out.println("Added: "+ dvd.getTitle());
	}
	public void removeDVD(DigitalVideoDisc dvd) {
	if (itemsInStore.size()==0) {
		System.out.println("Empty");
	}
		itemsInStore.add(dvd);
		System.out.println("Added: "+ dvd.getTitle());
	}
	public  void displayStore() {
        System.out.println("\n--- Available DVDs in Store ---");
        for (int i = 0; i < itemsInStore.size(); i++) {
            DigitalVideoDisc dvd = itemsInStore.get(i);
            System.out.println((i + 1) + ". " + dvd.getTitle() + " - Cost: " + dvd.getCost());
        }
        System.out.println("-----------------------------");
    }
}
