import java.util.Scanner;
public class XORSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a,b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before: a=" + a + " b=" + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("after: a=" + a + " b=" + b);
    }
}