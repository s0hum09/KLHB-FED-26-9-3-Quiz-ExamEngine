import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] composite = new boolean[n + 1];
        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (!composite[p]) { 
                count++;
                for (int m = p * p; m <= n; m += p) composite[m] = true;
            }
        }
        System.out.println(count + " primes up to " + n);
    }
}