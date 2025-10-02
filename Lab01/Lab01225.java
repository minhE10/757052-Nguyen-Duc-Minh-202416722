import java.io.*;

public class Lab01225 {
    static double add(double a, double b) {
        return a + b;
    }

    static double product(double a, double b) {
        return a * b;
    }
    static void quotient(double a, double b) {
        if (b==0) {
            System.out.println("Divisor must be different from 0");
        }
        else {
            System.out.println(a/b);
        }
    }
    static double difference(double a, double b) {
        return add(a,-b);
    }
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());

        System.out.printf("Sum: %.2f%n", add(a, b));
        System.out.printf("Product: %.2f%n", product(a, b));
        System.out.printf("Difference: %.2f%n", difference(a, b));
        System.out.print("Quotient ");
        quotient(a, b);

        //System.out.println(Math.round(add(a,b)));
    }
}
