import java.util.Scanner;
public class BitChanger {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n, bit position i: ");
        int n = sc.nextInt(), i = sc.nextInt();

        int power = (int) Math.pow(2, i);
        
        int get = (n / power) % 2;
        int set = (get == 1) ? n : n + power;
        int clear = (get == 1) ? n - power : n;
        int toggle = (get == 1) ? n - power : n + power;

        System.out.println("bit=" + get + "  set=" + set + "  clear=" + clear + "  toggle=" + toggle);
    }
}