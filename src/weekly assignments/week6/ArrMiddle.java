import java.util.Scanner;

public class ArrMiddle { 
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int left = 0, eq = -1;
        for (int i = 0; i < n; i++) {
            int right = total - left - arr[i];
            if (left == right) {
                eq = i;
                break;
            }
            left += arr[i];
        }
        if (eq >= 0){
            System.out.println("equilibrium index = " + eq);
        }
        else {
            System.out.println("no equilibrium index");
    }
}
}