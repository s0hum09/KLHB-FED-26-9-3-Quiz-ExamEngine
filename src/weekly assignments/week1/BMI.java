import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight kg, height m: ");
        double w = sc.nextDouble(), h = sc.nextDouble();
        double bmi = w / (h * h);
        String cat = (bmi < 18.5) ? "underweight" : (bmi < 25.0) ? "normal" : (bmi < 30.0) ? "overweight" : "obese";
        
        System.out.printf("BMI = %.1f -> %s%n", bmi, cat);
    }
}