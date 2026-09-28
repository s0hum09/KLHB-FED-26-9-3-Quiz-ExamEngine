import java.util.Scanner;

public class CountBits {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) { 
            n = n & (n - 1); 
            count++;
        }
        System.out.println("set bits = " + count);
        sc.close();
    }
}