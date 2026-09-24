import java.util.Scanner;
public class MailRoomMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int received = 0, pickedUp = 0;
        boolean running = true;
        while (running) { 
            String comd = sc.next(); 
            switch (comd) {
                case "r": 
                    received++;
                    System.out.println("Received. In lockers: " + (received - pickedUp));
                    break;
                case "p": 
                    if (pickedUp < received) {
                        pickedUp++;
                        System.out.println("Picked up. In lockers: " + (received - pickedUp));
                    } else {
                        System.out.println("Nothing to pick up.");
                    }
                    break;
                case "s": 
                    System.out.println(
                            "Received "
                                    + received
                                    + ", picked up "
                                    + pickedUp
                                    + ", in lockers "
                                    + (received - pickedUp));
                    break;
                case "e": 
                    running = false;
                    System.out.println(
                            "Closing. " + (received - pickedUp) + " parcel(s) still in lockers.");
                    break;
                default:
                    System.out.println("Unknown command: " + comd);
            }
        }
    }
}