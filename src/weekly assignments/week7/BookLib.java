public class BookLib {
    static class Book {
        private String title;
        private boolean onLoan;

        Book(String title) {
            this.title = title;
            this.onLoan = false;
        }

        String getTitle() {
            return title;
        }

        boolean borrow() {
            if (onLoan) return false; 
            onLoan = true;
            return true;
        }

        void returned() {
            onLoan = false;
        }

        boolean isAvailable() {
            return !onLoan;
        }
    }

    public static void main(String[] args) {

        Book b = new Book("Effective Java");
        
        System.out.println(b.getTitle() + " available? " + b.isAvailable());
        System.out.println("First borrow: " + b.borrow());
        System.out.println("Second borrow: " + b.borrow());
        b.returned();
        System.out.println("After return, available? " + b.isAvailable());

    }
}