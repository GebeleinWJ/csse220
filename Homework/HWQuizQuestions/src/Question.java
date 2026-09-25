/**
 * Class: Question
 * @author Will Gebelein
 * <br>Purpose: Contains questions for quizzes.
 * <br>Restrictions: Cannot display Question queries without the Quiz class.
 */
public class Question {
    int id;
    String query;
    //Constructor
    Question(int ident, String question){
        this.id = ident;
        this.query = question;
    }
    //Question Access
    public String questionCall(){
        return "Question ["+this.id+"]: "+this.query;
    }
}
/**
 * Nice and easy. Question really didn't need much.
 */