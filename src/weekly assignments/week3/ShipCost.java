import java.util.Scanner;
public class ShipCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg) and distance (km): ");
        double weight = sc.nextDouble();
        double distance = sc.nextDouble();

        double cost;
        if (weight <= 5) {
            cost = distance * 2;
        } else if (weight <= 20) {
            cost = distance * 5;
        } else {
            cost = distance * 10;
        }

        System.out.println("Shipping Cost: Rs " + cost);
    }
}