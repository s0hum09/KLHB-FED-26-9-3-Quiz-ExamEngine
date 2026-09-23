import java.util.Scanner;
public class TierLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parcel weight: ");
        double w = sc.nextDouble();

        if (w <= 2) {
            System.out.println("Locker Tier: Small");
        } else if (w <= 5) {
            System.out.println("Locker Tier: Medium");
        } else if (w <= 10) {
            System.out.println("Locker Tier: Large");
        } else {
            System.out.println("Locker Tier: Extra Large");
        }
    }
}