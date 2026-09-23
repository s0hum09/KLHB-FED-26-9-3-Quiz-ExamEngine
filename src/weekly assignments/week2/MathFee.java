public class MathFee {
    public static void main(String[] args) {
        int days = 7, feePerDay = 10;
        int total = days * feePerDay; // 70

        double avgBad = total / 3;
        double avgGood = total / 3.0; 
        double drift = 0.1 + 0.2; 
        int truncated = (int) 9.99; 

        System.out.println("total         = " + total);
        System.out.println("avg (int div) = " + avgBad);
        System.out.println("avg (fixed)   = " + avgGood);
        System.out.println("0.1 + 0.2     = " + drift);
        System.out.println("(int) 9.99    = " + truncated);
    }
}