import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a >= b && a >= c) ? a : (b >= c) ? b : c;
        System.out.println("max: " + max);
    }
}