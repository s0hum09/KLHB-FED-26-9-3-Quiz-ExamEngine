import java.util.Scanner;

public class DigitSum { 
    static int digitSum(int n) {
        if (n == 0) return 0;
        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("digit sum = " + digitSum(n < 0 ? -n : n));
    }
}