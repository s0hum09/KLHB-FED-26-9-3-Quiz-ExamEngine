import java.util.Scanner;
public class ReversingBytes {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i < 8; i++) { 
            result = (result << 1) | (n & 1); 
            n = n >> 1; 
        }
        System.out.println(result);
    }
}