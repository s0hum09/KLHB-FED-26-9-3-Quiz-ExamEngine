import java.util.Scanner;

public class Ticket {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String day = sc.next();
        int base;
        if (age < 12) base = 5;
        else if (age >= 65) base = 7;
        else base = 10;
        boolean weekend = day.equals("Sat") || day.equals("Sun");
        int price = base + (weekend ? 2 : 0);
        System.out.println("Rs " + price);
        sc.close();
    }
}