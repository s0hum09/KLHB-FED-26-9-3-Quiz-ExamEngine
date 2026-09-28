public class RectDimension {
    static class Rectangle {
        private int width, height;

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        Rectangle(int side) {
            this(side, side);
        } // a square

        int area() {
            return width * height;
        }

        int perimeter() {
            return 2 * (width + height);
        }

        boolean isSquare() {
            return width == height;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);
        Rectangle sq = new Rectangle(5);

        System.out.println(
                "r: area=" + r.area() + " perimeter=" + r.perimeter() + " square=" + r.isSquare());
                
        System.out.println(
                "sq: area="
                        + sq.area()
                        + " perimeter="
                        + sq.perimeter()
                        + " square="
                        + sq.isSquare());
    }
}
