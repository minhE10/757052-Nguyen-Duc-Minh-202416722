import java.io.*;
public class Triangle {
    public static void main(String args[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the height of the triangle:");
        int height=Integer.parseInt(br.readLine());
        for(int i=1;i<=height;i++) {
            for(int j=i;j<height;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
