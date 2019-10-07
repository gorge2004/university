package Model;

import java.util.ArrayList;

public class Test {
    private String name;
    private ArrayList<String> question = new ArrayList<>();
    private float score = 0.0f;

    public void AddQuestion(String question) {
        this.question.add(question) ;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(String answer) {
        this.answers.add(answer) ;
    }

    private ArrayList<String> answers = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getQuestion() {
        return question;
    }

    public void addQuestion(String question) {
        this.question.add(question);
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
