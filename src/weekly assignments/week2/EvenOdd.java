import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        String type = ((n & 1) == 0) ? "even" : "odd";
        System.out.println(n + " is " + type);
    }
}