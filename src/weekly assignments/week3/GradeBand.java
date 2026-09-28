import java.util.Scanner;

public class GradeBand {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        char g;
        switch (s / 10) {
            case 10:
            case 9:
                g = 'A';
                break;
            case 8:
                g = 'B';
                break;
            case 7:
                g = 'C';
                break;
            case 6:
                g = 'D';
                break;
            default:
                g = 'F';
        }
        System.out.println("Grade " + g);
        sc.close();
    }
}