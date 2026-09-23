import java.util.Scanner;
public class ShelfSplit {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Parcels, shelves: ");
        int parcels = sc.nextInt(), shelves = sc.nextInt();
        int per = parcels / shelves;
        int leftover = parcels % shelves;
        System.out.println(per + " each, " + leftover + " left over");
    }
}