import java.util.Scanner;

public class FastPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();
        int exp = sc.nextInt();
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result *= b;
            b *= b; 
            exp >>= 1; 
        }
        System.out.println("result = " + result);
        sc.close();
    }
}