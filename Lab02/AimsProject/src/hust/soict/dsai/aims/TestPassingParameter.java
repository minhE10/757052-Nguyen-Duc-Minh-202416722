package hust.soict.dsai.aims;

public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        changeTitle(jungleDVD,"Cindrella" );
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    public static void swap(DigitalVideoDisc d1, DigitalVideoDisc d2) {
        String tmpTitle = d1.getTitle();
        String tmpCategory = d1.getCategory();
        String tmpDirector = d1.getDirector();
        int tmpLength = d1.getLength();
        float tmpCost = d1.getCost();

        
        d1.setTitle(d2.getTitle());
        d1.setCategory(d2.getCategory());
        d1.setDirector(d2.getDirector());
        d1.setLength(d2.getLength());
        d1.setCost(d2.getCost());

        
        d2.setTitle(tmpTitle);
        d2.setCategory(tmpCategory);
        d2.setDirector(tmpDirector);
        d2.setLength(tmpLength);
        d2.setCost(tmpCost);
    }
}

