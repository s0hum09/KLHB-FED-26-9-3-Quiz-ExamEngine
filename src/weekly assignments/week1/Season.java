import java.util.Scanner;
public class Season {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Month (1-12): ");
        int m = sc.nextInt();
        String season =
                (m == 12 || m <= 2) ? "winter" : (m <= 5) ? "spring" : (m <= 8) ? "summer" : "autumn";

        System.out.println("Month " + m + " -> " + season);
    }
}