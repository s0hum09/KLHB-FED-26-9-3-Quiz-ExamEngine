import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Three-digit number: ");
        int n = sc.nextInt();
        int h = n / 100;
        int t = (n / 10) % 10;
        int u = n % 10;
        int rev = u * 100 + t * 10 + h;
        String pal = (n == rev) ? "palindrome" : "not a palindrome";
        System.out.println("reverse = " + rev + " (" + pal + ")");
        sc.close();
    }
}