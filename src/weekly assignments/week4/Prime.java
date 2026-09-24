import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean prime = n >= 2;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(n + (prime ? " is prime" : " is not prime"));
    }
}