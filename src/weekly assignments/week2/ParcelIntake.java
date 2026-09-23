import java.util.Scanner;

public class ParcelIntake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Parcel ID: ");
        String id = sc.next();
        System.out.println("Recipient: ");
        String who = sc.next();
        System.out.println("Size: ");
        char size = sc.next().charAt(0);
        System.out.println("Weight: ");
        double kg = sc.nextDouble();

        int base = (size == 'L') ? 30 : (size == 'M') ? 20 : 10;

        int roundedKg = (int) kg;
        if (kg > roundedKg) {
            roundedKg = roundedKg + 1;
        }
        int surcharge = roundedKg * 2; 
        int fee = base + surcharge;

        System.out.println();
        System.out.println("------ INTAKE RECEIPT ------");
        System.out.println("Parcel   : " + id);
        System.out.println("For      : " + who);
        System.out.println("Size/Wt  : " + size + " / " + kg + " kg");
        System.out.println("Fee      : Rs " + fee + ".00");
        System.out.println("---------------------------");
    }
}