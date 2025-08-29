/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2493512
 */
public class CourseGrades implements Analyzable {
    private final int NUM_GRADES = 4;
    private GradedActivity grades[];

    public CourseGrades() {
        this.grades = new GradedActivity[NUM_GRADES];
    }
    
    public void setLab(GradedActivity aLab) {
        this.grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        this.grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        this.grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        this.grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        return String.format("""
                             Lab Score: %.1f  Grade: %s
                             Pass/Fail Exam Score: %.1f  Grade: %s
                             Essay Score: %.1f  Grade: %s
                             Final Exam Score: %.1f  Grade: %s
                             """, 
                grades[0].getScore(), grades[0].getGrade(),
                grades[1].getScore(), grades[1].getGrade(),
                grades[2].getScore(), grades[2].getGrade(),
                grades[3].getScore(), grades[3].getGrade()
        );
    }

    @Override
    public double getAverage() {
        return (grades[0].getScore() + grades[1].getScore() + grades[2].getScore() + grades[3].getScore()) / NUM_GRADES;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity max;
        
        max = grades[0].getScore() > grades[1].getScore() ? grades[0] : grades[1];
        max = max.getScore() > grades[2].getScore() ? max : grades[2];
        max = max.getScore() > grades[3].getScore() ? max : grades[3];

        return max;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity min;
        
        min = grades[0].getScore() < grades[1].getScore() ? grades[0] : grades[1];
        min = min.getScore() < grades[2].getScore() ? min : grades[2];
        min = min.getScore() < grades[3].getScore() ? min: grades[3];

        return min;
    }
    
    
}
