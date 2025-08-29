
import java.security.InvalidParameterException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2493512
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;
    
    

    public void setScore(double gr, double sp, double len, double cnt) {
        this.setGrammar(gr);
        this.setSpelling(sp);
        this.setCorrectLength(len);
        this.setContent(cnt);
        
        this.setScore(this.grammar + this.spelling + this.content + this.correctLength);
    }
    
    public void setGrammar(double grammar) {
        if (grammar > 30) {
            System.out.println("Invalid score: Grammar score must be less than 30");
        }
        
        this.grammar = grammar;
    }

    public void setSpelling(double spelling) {
        if (spelling > 20) {
            System.out.println("Invalid score: Spelling score must be less than 20");
        }
        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        if (correctLength > 20) {
            System.out.println("Invalid score: Length score must be less than 20");
        }
        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        if (content > 30) {
            System.out.println("Invalid score: Content score must be less than 30");
        }
        this.content = content;
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return String.format("""
                      Total points: %.1f
                             Grade: %s
                      """,
                this.getScore(),
                this.getGrade()
        );
    }
    
    
}
