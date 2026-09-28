import java.util.Scanner;

public class Calc {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
            
        double x = sc.nextDouble();
        char op = sc.next().charAt(0);
        double y = sc.nextDouble();

        double r;
        boolean ok = true;

        switch (op) {
            case '+':
                r = x + y;
                break;

            case '-':
                r = x - y;
                break;

            case '*':
                r = x * y;
                break;

            case '/':
                if (y == 0) {
                    ok = false;
                    r = 0;
                } else {
                    r = x / y;
                }
                break;

            default:
                ok = false;
                r = 0;
        }

        if (ok)
            System.out.println(Math.round(r * 100.0) / 100.0);
        else
            System.out.println("error");
        sc.close();
    }
}