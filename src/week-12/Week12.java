import java.util.ArrayList;
import java.util.List;

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

    private void add(String text, String answer, int level) { bank.add(new Question(text, answer, level)); }

    private Question nextQuestion(int level) {
        for (Question question : bank) if (question.level == level) return question;
        return bank.get(0);
    }

    private boolean evaluate(Question question, String submitted) {
        return question.answer.equalsIgnoreCase(submitted.trim());
    }

    public static void main(String[] args) {
        AdaptiveQuiz quiz = new AdaptiveQuiz();
        quiz.add("What keyword creates an object in Java?", "new", 1);
        quiz.add("What collection keeps an ordered list of values?", "ArrayList", 2);
        quiz.add("Which principle hides object internals?", "encapsulation", 3);

        String[] submittedAnswers = {"new", "arraylist", "inheritance"};
        int level = 1, score = 0;
        System.out.println("ADAPTIVE QUIZ & EXAM ENGINE — FINAL RELEASE");

        for (String submitted : submittedAnswers) {
            Question question = quiz.nextQuestion(level);
            boolean correct = quiz.evaluate(question, submitted);
            if (correct) { score++; level = Math.min(3, level + 1); }
            else level = Math.max(1, level - 1);
            System.out.printf("L%d: %s%nAnswer: %s | %s | Next level: %d%n",
                    question.level, question.text, submitted, correct ? "Correct" : "Incorrect", level);
        }

        System.out.printf("Score: %d/%d | Final difficulty level: %d%n", score, submittedAnswers.length, level);
    }
}
