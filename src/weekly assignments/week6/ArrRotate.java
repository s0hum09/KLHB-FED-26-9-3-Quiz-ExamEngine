import java.util.Scanner;

public class ArrRotate { 
    static void rev(int[] a, int lo, int hi) {

        while (lo < hi) {
            int t = a[lo];
        
            a[lo] = a[hi];
            a[hi] = t;
            lo++;
            hi--;
        }
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt() % n;
        rev(arr, 0, n - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
