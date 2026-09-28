import java.util.Scanner;

public class SumofArrTwo {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();
        int lo = 0, hi = n - 1;
        boolean found = false;
        while (lo < hi) {
            int s = arr[lo] + arr[hi];
            if (s == target) {
                System.out.println(
                        "indices " + lo + " and " + hi + " (" + arr[lo] + "+" + arr[hi] + ")");
                found = true;
                break;
            } else if (s < target) lo++;
            else hi--;
        }
        if (!found) System.out.println("no pair sums to " + target);
    }
}