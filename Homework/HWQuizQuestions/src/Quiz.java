import java.util.*;


/**
 * Class: Quiz
 * @author Will Gebelein
 * <br>Purpose: Holds and displays Question classes. Each quiz can have a different or same set of questions.
 * <br>Restrictions: Quiz cannot add or remove Questions, only change them.
 */
public class Quiz {
    Question[] questions;
    int id;

    /**
     * The constructor. It gives each instance of the Quiz class its unique instance variables, most notably the
     * questions array of questions.
     * Its inputs are the id and length of Quiz.
     * @param i
     * @param length
     */
    Quiz(int i, int length){
        this.questions= new Question[length];
        this.id=i;
        for(int j = 0; j<length; j++){
            this.questions[j] = new Question(0,"This is a placeholder"); //As stated, this is a placeholder so no null can cause an error.
        }
    }

    /**
     * updateQuestions allows the Quiz to update its roster of questions when they get changed.
     * It uses the list of Questions to pick from and a chosen ID to choose what to update.
     * @param list
     * @param selected
     */
    public void updateQuestions(HashMap<Integer, Question> list, int selected){
        Set<Integer> temp = list.keySet();
        Object[] arr = temp.toArray();//This was the first way I learnt to get key values from HashMaps
        for(int i = 1; i<=list.size(); i++){
            if(Objects.equals(arr[i-1],selected)){ //Object.equals is needed here. No other method I know could successfully equate the Object set to the int primitive.
                for(int j = 0; j<this.questions.length; j++){
                    if(this.questions[j].id == 0||this.questions[j].id==selected){ //The or is needed so the initial placeholder is overwritten.
                        this.questions[j]=list.get(i);
                        break; //Without this break, every question is the same.
                    }
                }
            }
        }
    }

    /**
     * listQuestions prints out each returned questionCall() from its chosen Question classes.
     */
    public void listQuestions(){
        System.out.println("Quiz: "+id);
        for (int i = 0; i<this.questions.length; i++){
            System.out.println(this.questions[i].questionCall());
        }
    }
}
/**
 * More complex than Question, but not much larger. Most of Quiz's functions were easy to do.
 * updateQuestions probably took 2 years off my life.
 */