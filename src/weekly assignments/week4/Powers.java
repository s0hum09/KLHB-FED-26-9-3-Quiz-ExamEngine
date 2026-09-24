import java.util.Scanner;
public class Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int asInt = 1; 
        long asLong = 1L; 
        for (int i = 0; i < n; i++) {
            asInt *= 2; 
            asLong *= 2; 
        }
        System.out.println("int  gives: " + asInt);
        System.out.println("long gives: " + asLong);
    }
}