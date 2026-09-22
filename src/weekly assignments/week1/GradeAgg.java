import java.util.Scanner;
public class GradeAgg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Three marks: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        double avg = (m1 + m2 + m3) / 3.0;
        char grade;
        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';
        System.out.println("Average = " + avg + " Grade is " + grade);
    }
}