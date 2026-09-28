import java.util.Scanner;

public class OppositeSigns {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        // the sign bit of (x ^ y) is 1 exactly when x and y have different signs
        boolean opposite = (x ^ y) < 0;
        System.out.println(opposite ? "opposite signs" : "same sign");
        sc.close();
    }
}