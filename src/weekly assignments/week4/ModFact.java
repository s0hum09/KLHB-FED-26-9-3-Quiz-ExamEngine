import java.util.Scanner;

public class ModFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long MOD = 1000000007L;
        long f = 1L;
        for (int i = 2; i <= n; i++) {
            f = (f * i) % MOD; // reduce every step so it never grows large
        }
        System.out.println(n + "! mod 1e9+7 = " + f);
    }
}