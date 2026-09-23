import java.util.Scanner;
public class ChangeGiving {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount in rupees: ");
        int amt = sc.nextInt();
        int n500 = amt / 500;
        amt %= 500;
        int n100 = amt / 100;
        amt %= 100;
        int n50 = amt / 50;
        amt %= 50;
        int n10 = amt / 10;
        amt %= 10;
        int n1 = amt;
        System.out.println("500x" + n500 + "\n100x" + n100 + "\n50x" + n50 + "\n10x" + n10 + "\n1x" + n1);
    }
}