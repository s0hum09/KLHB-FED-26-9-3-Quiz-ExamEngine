import java.util.Scanner;

public class BitToolkit {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n, bit position i: ");
        int n = sc.nextInt(), i = sc.nextInt();
        int get = (n >> i) & 1;
        int set = n | (1 << i);
        int clear = n & ~(1 << i);
        int toggle = n ^ (1 << i);
        System.out.printf("bit=%d  set=%d  clear=%d  toggle=%d%n", get, set, clear, toggle);
    }
}