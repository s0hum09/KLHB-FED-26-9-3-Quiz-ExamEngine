import java.util.Scanner;
public class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter light color (R,Y,G): ");
        String color = sc.next().toLowerCase();

        switch (color) {
            case "red": System.out.println("Action: Stop"); break;
            case "yellow": System.out.println("Action: Slow down / Prepare to stop"); break;
            case "green": System.out.println("Action: Go"); break;
            default: System.out.println("Invalid traffic light color."); break;
        }
    }
}