import java.util.Scanner;

public class OneBitApart {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b = sc.nextInt();
        int d = a1 ^ b; // 1s exactly where the two numbers differ
        boolean oneBit = d != 0 && (d & (d - 1)) == 0; // is that a single 1? (power-of-two test)
        System.out.println(oneBit ? "differ by exactly one bit" : "no");
        sc.close();
    }
}