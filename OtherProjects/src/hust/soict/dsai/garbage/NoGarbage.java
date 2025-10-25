package hust.soict.dsai.garbage;

import java.nio.file.*;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "test.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (byte b : inputBytes) {
            sb.append((char) b);
        }
        String outputString = sb.toString();
        
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}

