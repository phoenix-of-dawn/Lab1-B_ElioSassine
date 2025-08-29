/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2493512
 */
public class FinalExam extends GradedActivity {
    private double pointsEach;
    private int numQuestions;
    private int numMissed;
    
    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / this.numQuestions;
        this.setScore(100.0 - (this.numMissed * this.pointsEach));
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    @Override
    public String toString() {
        return String.format("""
                      Each questions counts for %.1f points
                      The exam score is %.1f
                      The exam grades is %s
                      """,
                this.pointsEach,
                this.getScore(),
                this.getGrade()
        );
    }
}
