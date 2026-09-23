import java.util.Scanner;
public class PowerofFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = sc.nextInt();

        int temp = n;
        if (temp > 0) {
            while (temp % 4 == 0) {
                temp = temp / 4;
            }
        }
        if (temp == 1) {
            System.out.println(n + " is a Power of 4.");
        } else {
            System.out.println(n + " is NOT a Power of 4.");
        }
    }
}