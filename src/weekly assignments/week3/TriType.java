import java.util.Scanner;
public class TriType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side lengths: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triangle Type: Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triangle Type: Isosceles");
            } else {
                System.out.println("Triangle Type: Scalene");
            }
        } else {
            System.out.println("Not a valid triangle.");
        }
    }
}