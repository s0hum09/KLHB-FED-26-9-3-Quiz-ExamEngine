import java.util.Scanner;

public class LockerTier {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Parcel weight (kg): ");
        double kg = sc.nextDouble();
        char tier;
        if (kg <= 2.0) tier = 'S';
        else if (kg <= 10.0) tier = 'M';
        else tier = 'L';
        System.out.println("Parcel Tier: " + tier);
        sc.close();
    }
}