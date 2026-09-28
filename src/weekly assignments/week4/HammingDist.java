import java.util.Scanner;

public class HammingDist {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int diff = x ^ y;
        int count = 0;
        while (diff != 0) {
            diff = diff & (diff - 1);
            count++;
        }
        System.out.println("bits to flip = " + count);
        sc.close();
    }
}