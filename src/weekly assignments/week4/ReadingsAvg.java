public class ReadingsAvg {
    public static void main(String[] args) {
        
        int[] temp = {72, 75, 71, 78, 74};
        int sum = 0;
        for (int t : temp) {
            sum += t;
        }
        double avg = (double) sum / temp.length;
        System.out.println("avg=" + avg + " over " + temp.length + " readings");
    }
}