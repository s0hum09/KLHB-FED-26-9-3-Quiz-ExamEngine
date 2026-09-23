import java.util.Scanner;
public class Diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Target, actual: ");
        int target = sc.nextInt(), actual = sc.nextInt();
        int diff = actual - target; 
        int off = (diff < 0) ? -diff : diff; 
        System.out.println("off target by " + off + " kg");
    }
}