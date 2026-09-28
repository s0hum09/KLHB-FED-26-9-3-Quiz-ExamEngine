public class Temperature {
    static class Temp {

        static final double FREEZING_C = 0.0, BOILING_C = 100.0;

        static double toFar(double c) {
            return c * 9 / 5 + 32;
        }

        static double toCel(double f) {
            return (f - 32) * 5 / 9;
        }

        static String describe(double c) {

            if (c <= FREEZING_C) 
                {return "freezing";}
            if (c >= BOILING_C) 
                {return "boiling";}
            return "liquid";
        }
    }

    public static void main(String[] args) {

        System.out.println("37C = " + Temp.toFar(37) + "F");
        System.out.println("212F = " + Temp.toCel(212) + "C");
        System.out.println("Water at 0C is " + Temp.describe(0));
        System.out.println("Water at 50C is " + Temp.describe(50));
    }
}