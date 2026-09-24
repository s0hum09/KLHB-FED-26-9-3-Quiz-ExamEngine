import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        String parity = ((n & 1) == 0) ? "even" : "odd";
        System.out.println(n + " is " + parity);
        sc.close();
    }
}