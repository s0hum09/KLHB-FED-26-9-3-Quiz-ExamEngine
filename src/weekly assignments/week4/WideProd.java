public class WideProd {
    public static void main(String[] args) {
        int a = 100000, b = 100000;
        
        long wrong = a * b; 
        long right = (long) a * b; 

        System.out.println("wrong (int math):  " + wrong);
        System.out.println("right (long math): " + right);
    }
}