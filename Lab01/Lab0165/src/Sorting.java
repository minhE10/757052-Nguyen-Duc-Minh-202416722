import java.io.*;
public class Sorting {
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        String num= br.readLine();

        String[] numbers = num.split(" ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(numbers[i]);
            
        }
        // valid range is 0..n-1 for the indexes
        
        mergesort(arr, 0, n - 1);
        
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
