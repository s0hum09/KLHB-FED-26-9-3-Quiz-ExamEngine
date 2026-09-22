import java.util.Scanner;
public class LoanElig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age, income, credit: ");
        int age = sc.nextInt(), income = sc.nextInt(), score = sc.nextInt();
        boolean eligible = (age >= 21 && age <= 60) && (income >= 25000) && (score >= 700);

        System.out.println(eligible ? "Approved" : "Rejected");
    }
}
    
 
