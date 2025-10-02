import java.io.*;
public class MatricesSum {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input= br.readLine();
        String [] part= input.split(" ");
        int [] size =new int[1000];
        for (int i=0; i<part.length; i++) {
            size[i]=Integer.parseInt(part[i]);
        }
        int [][] matrix1= new int [size[0]+1][size[1]+1];
        for (int i=0; i<size[0]; i++) {
            input=br.readLine();
            part=input.split(" ");
            int [] row= new int[10000];
            for (int j=0; j<size[1]; j++) {
                row[j]=Integer.parseInt(part[j]);
                matrix1[i][j]=row[j];
            }
        }
        input= br.readLine();
        part= input.split(" ");
        int [] size2 =new int[1000];
        for (int i=0; i<part.length; i++) {
            size2[i]=Integer.parseInt(part[i]);
        }
        int [][] matrix2= new int [size[0]+1][size[1]+1];
        for (int i=0; i<size2[0]; i++) {
            input=br.readLine();
            part=input.split(" ");
            int [] row= new int[10000];
            for (int j=0; j<size2[1]; j++) {
                row[j]=Integer.parseInt(part[j]);
                matrix2[i][j]=row[j];
            }
        }
        
        if (size[0]!=size2[0] || size[1]!=size2[1]) {
            System.out.println("Size difference");
        }
        else {
            for (int i=0; i<size[0]; i++) {
                for (int j=0; j<size[1]; j++) {
                    matrix1[i][j]+=matrix2[i][j];
                    System.out.print(matrix1[i][j]+" ");
                
                }
                System.out.println();
            }
            
        }

    }
}
