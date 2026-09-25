import java.util.Scanner;

public class Reverse { 
    static String rev(String s) {
        if (s.length() <= 1) return s;
        
        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(rev(s));
    }
}