import java.util.Scanner;

public class ArrStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = sc.nextInt();
        int sum = first, max = first, min = first;

        for (int i = 1; i < n; i++) {
            int val = sc.nextInt();
            sum += val;
            if (val > max) max = val;
            if (val < min) min = val;
        }

        System.out.println("sum=" + sum + " avg=" + ((double) sum / n) + " max=" + max + " min=" + min);
    }
}