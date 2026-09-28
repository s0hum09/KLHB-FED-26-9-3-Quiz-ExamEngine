public class DistTwoPts {
    static class Point {
        private double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double distanceTo(Point o) {
            double dx = x - o.x, dy = y - o.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("distance = " + a.distanceTo(b));
    }
}