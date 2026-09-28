import java.util.Scanner;

public class FeeBand {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int fee;
        if (d <= 1) fee = 0;
        else if (d <= 3) fee = (d - 1) * 20;
        else fee = 2 * 20 + (d - 3) * 30;
        System.out.println("Rs " + fee);
        sc.close();
    }
}