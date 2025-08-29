/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2493512
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;
    
    public PassFailExam(int questions, int missed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / this.numQuestions;
        this.setScore(100.0 - (this.numMissed * this.pointsEach));
    }
    
    
}
