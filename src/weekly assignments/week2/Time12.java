import java.util.Scanner;
public class Time12 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hour (0-23): ");
        int h = sc.nextInt();

        String ampm = "AM";
        int h12 = h;

        if (h >= 12) {
            ampm = "PM";
        }

        if (h == 0) {
            h12 = 12;
        } else if (h > 12) {
            h12 = h - 12;
        }
        if (h < 10) {
            System.out.println("0" + h + ":00 = " + h12 + " " + ampm);
        } else {
            System.out.println(h + ":00 = " + h12 + " " + ampm);
        }
    }
}