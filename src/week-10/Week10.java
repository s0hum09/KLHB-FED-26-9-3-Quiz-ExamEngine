import java.nio.file.*;

public class Week10 {
    public static void main(String[] args) throws Exception {

        Path p = Path.of("result.txt");

        Files.writeString(p, "Score = 8");

        System.out.println(Files.readString(p));

        Files.delete(p);
    }
}