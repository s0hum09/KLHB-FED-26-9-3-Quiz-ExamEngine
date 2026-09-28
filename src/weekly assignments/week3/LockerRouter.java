
import java.util.Scanner;

public class LockerRouter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longSide = sc.nextInt(); // longest side, cm
        double weight = sc.nextDouble(); // kg

        // Pick the tier
        char tier;

        if (longSide <= 20 && weight <= 2.0)
            tier = 'S';
        else if (longSide <= 40 && weight <= 5.0)
            tier = 'M';
        else if (longSide <= 60 && weight <= 10.0)
            tier = 'L';
        else
            tier = 'X';

        // Map the tier to a shelf zone and note
        String zone, note;

        switch (tier) {
            case 'S':
                zone = "Zone A";
                note = "cubby shelf";
                break;

            case 'M':
                zone = "Zone B";
                note = "standard locker";
                break;

            case 'L':
                zone = "Zone C";
                note = "tall locker";
                break;

            default:
                zone = "Counter";
                note = "manual handling";
                break;
        }

        System.out.println("Tier " + tier + " -> " + zone + " (" + note + ")");

        sc.close();
    }
}