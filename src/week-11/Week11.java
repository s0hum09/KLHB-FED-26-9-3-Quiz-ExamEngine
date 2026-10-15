import java.util.*;

public class Week11 {
    public static void main(String[] args) {

        List<Integer> scores = List.of(6, 8, 9);

        int bestScore = Collections.max(scores);

        System.out.println("Best score: " + bestScore);
    }
}
