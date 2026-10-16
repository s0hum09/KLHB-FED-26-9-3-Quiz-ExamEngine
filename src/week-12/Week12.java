import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Week12 {
    private static class Question {
        final String text;
        final String answer;
        final int level;

        Question(String text, String answer, int level) {
            this.text = text; this.answer = answer; this.level = level;
        }
    }

    private final List<Question> bank = new ArrayList<>();

    private void add(String text, String answer, int level) { 
        bank.add(new Question(text, answer, level)); 
    }

    private Question nextQuestion(int level) {
        for (Question question : bank) if (question.level == level) return question;
        return bank.get(0);
    }

    private boolean evaluate(Question question, String submitted) {
        return question.answer.equalsIgnoreCase(submitted.trim());
    }

    public static void main(String[] args) {
        Week12 quiz = new Week12();
        quiz.add("What keyword creates an object in Java?", "new", 1);
        quiz.add("What collection keeps an ordered list of values?", "ArrayList", 2);
        quiz.add("Which principle hides object internals?", "encapsulation", 3);

        Scanner scanner = new Scanner(System.in); 
        int level = 1, score = 0;
        int totalQuestions = 3;
        
        System.out.println("ADAPTIVE QUIZ & EXAM ENGINE – FINAL RELEASE");

        // 3. Loop interactively for each question
        for (int i = 0; i < totalQuestions; i++) {
            Question question = quiz.nextQuestion(level);
            
            System.out.println("\nL" + question.level + ": " + question.text);
            System.out.print("Your answer: ");
            String submitted = scanner.nextLine(); 

            boolean correct = quiz.evaluate(question, submitted);
            if (correct) { 
                score++; 
                level = Math.min(3, level + 1); 
            } else {
                level = Math.max(1, level - 1);
            }

            System.out.printf("Result: %s | Next level: %d\n", correct ? "Correct" : "Incorrect", level);
        }
        
        scanner.close(); 
        System.out.printf("\nScore: %d/%d | Final difficulty level: %d\n", score, totalQuestions, level);
    }
}