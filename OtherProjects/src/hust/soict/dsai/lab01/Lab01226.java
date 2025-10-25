import java.io.*;
public class Lab01226 {
    static void linear_equation(double a, double b) {
        if (a==0) {
            if (b==0) {
                System.out.println("Infinite solution");
            }
            else {
                System.out.println("No Solution");
            }
        }
        else {
            System.out.println("One Solution " + b/a);
        }
    }
    static void second_degree_equation(double a, double b, double c) {
        Double delta=  b*b-4*a*c;
        if (delta>0) {
            System.out.print("2 different solutions: ");
            System.out.println((-b+Math.sqrt(delta))/(2*a)+ " "+ (-b-Math.sqrt(delta))/(2*a));
        }
        else if (delta==0) {
            System.out.print("One solution: "+-b/2/a);
        }
        else {
            System.out.println("No solution");
        }
    }
    static void solve1(double a, double b, double c) {
        if (a==0) {
            linear_equation(b, c);
        }
        else {
            second_degree_equation(a, b, c);
        }
    }
    static void solve2(double a11, double a12, double b1, double a21, double a22, double b2) {
        double detA= a11*a22-a21*a12;
        if (detA==0) {
            System.out.println("No Solution");
        }
        else {
            double detX = b1*a22 - b2*a12;
            double detY = a11*b2 - a21*b1;
            double x = detX / detA;
            double y = detY / detA;
            if (detX == 0 && detY == 0) {
                System.out.println("Infinite solution");
            } else {
                System.out.println("One solution: x=" + x + ", y=" + y);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String coe=br.readLine();
        
        String [] coefficent = coe.trim().split("\\s+");
        
        double[] numbers = new double[coefficent.length];
        for (int i = 0; i < coefficent.length; i++) {
            numbers[i] = Double.parseDouble(coefficent[i]);
            
        }
        if (numbers.length==3) {
            solve1(numbers[0], numbers[1], numbers[2]);
        }
        else if (numbers.length==6) {
            // nhap a11 a12 b11 a21 a22 b2
            solve2(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5]);
        }
    }
}
