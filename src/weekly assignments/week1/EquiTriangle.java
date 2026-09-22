import java.util.Scanner;
public class EquiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Three sides: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        String type =
                (x == y && y == z) ? "equilateral" : (x == y || y == z || x == z) ? "isosceles" : "scalene";
        System.out.println(type);
    }
}