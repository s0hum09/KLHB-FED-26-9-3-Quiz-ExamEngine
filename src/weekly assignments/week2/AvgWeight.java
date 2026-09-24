

import java.util.Scanner;

public class AvgWeight {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Two weights: ");
        double w1 = sc.nextDouble(), w2 = sc.nextDouble();

        double total = w1 + w2;
        double avg = total / 2.0;

        System.out.println("total = " + total + " kg");
        System.out.println("avg = " + avg + " kg");

        sc.close();
    }
}