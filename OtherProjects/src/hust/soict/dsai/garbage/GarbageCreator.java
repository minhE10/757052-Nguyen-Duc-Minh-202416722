package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i; 
        }
        System.out.println("Done!");
    }
}

