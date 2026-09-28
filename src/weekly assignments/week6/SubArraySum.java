import java.util.Scanner;

public class SubArraySum { 
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int desired = arr[0], cur = arr[0];
        for (int i = 1; i < n; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            desired = Math.max(desired, cur);
        }

        System.out.println("max subarray sum = " + desired);
    }
}
