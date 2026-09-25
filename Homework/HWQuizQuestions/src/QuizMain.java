import java.util.HashMap;

/**
 * This class is used to demonstrate a functional design involving Quizzes and
 * Questions which can be updated and displayed
 * 
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 *         No external help was received during the quiz.
 *         The question queries chosen are by HorrorSkunks (music creator), for however much it matters.
 *************************************************************************************** 
 */

/**
 * Class: QuizMain
 * @author Will Gebelein
 * <br>Purpose: Used to initalize Quiz and Question variables.
 * <br>Restrictions: One time use
 */
public class QuizMain {
	
	//DONE add instance variables here
	HashMap<Integer,Quiz> quizzical = new HashMap<Integer,Quiz>();
	HashMap<Integer,Question> gameTheory = new HashMap<Integer,Question>();
	public QuizMain() {
		// DONE In order to demonstrate functionality, please follow the TODOs below
		// You will have to create questions and quizzes when a QuizMain is created
		this.quizzical = new HashMap<Integer,Quiz>();
		this.gameTheory = new HashMap<Integer,Question>();
		// DONE 1 Create five questions (can be silly/basic questions) use id 1,2,3,4,5 ...
		Question question1 = new Question(1, "What's the capital of France?");
		Question question2 = new Question(2, "What does the cow say??");
		Question question3 = new Question(3, "Why's the door locked so tight?");
		Question question4 = new Question(4, "Why do you know where I sleep?");
		Question question5 = new Question(5, "Freebie.");

		// DONE 2 Create three or more quizzes  use id 1,2,3...
		//      (One quiz should share at least one question with another )
		Quiz quiz1 = new Quiz(1, 3);
		Quiz quiz2 = new Quiz(2,3);
		Quiz quiz3 = new Quiz(3,2);
		
		this.quizzical.put(quiz1.id,quiz1);
		this.quizzical.put(quiz2.id,quiz2);
		this.quizzical.put(quiz3.id,quiz3);
		this.gameTheory.put(question1.id,question1);
		this.gameTheory.put(question2.id,question2);
		this.gameTheory.put(question3.id,question3);
		this.gameTheory.put(question4.id,question4);
		this.gameTheory.put(question5.id,question5);
		quiz1.updateQuestions(this.gameTheory, 1);
		quiz1.updateQuestions(this.gameTheory, 2);
		quiz1.updateQuestions(this.gameTheory, 3);
		quiz2.updateQuestions(this.gameTheory, 1);
		quiz2.updateQuestions(this.gameTheory, 3);
		quiz2.updateQuestions(this.gameTheory, 5);
		quiz3.updateQuestions(this.gameTheory, 4);
		quiz3.updateQuestions(this.gameTheory, 5);

	}


	/**
	 * It's main. Nothing else to be said.
	 */
	public static void main(String[] args) {
		//We want to use instance variables of the QuizMain class so we need to construct a QuizMain object
		QuizMain myQuizSimulator = new QuizMain();

		// DONE 3 Display three or more different quizzes
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more original quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
		
		
		// DONE 4 Change two quiz questions
		// A. (One should be shared with two or more quizzes)
		// B. (One should be unique to one quiz)
		myQuizSimulator.handleUpdateQuizQuestion(1,"Can I ever afford a house?");
		myQuizSimulator.handleUpdateQuizQuestion(2,"What day is it today?");
		myQuizSimulator.handleUpdateQuizQuestion(3,"How old is Taylor Swift?");

		
		// DONE 5 Display the same three (or more) quizzes
		//	   A. One that has a unique question which changed
		//	   B. Two which share a question that has been changed		
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more changed quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
	}
	
	/**
	 *  This method displays a quiz chosen by an int quizId in a very similar fashion to the output provided
	 *  in exampleOutput.txt.
	 * 
	 * @param quizId
	 */
	public void handleDisplayQuiz(int quizId) {
		Quiz temp = quizzical.get(quizId);
		temp.listQuestions();
	}
	
	/**
	 * 
	 * This method replaces the data in the question with id=questionId with the new questionData.
	 * 
	 * @param questionId
	 * @param questionData
	 */
	public void handleUpdateQuizQuestion(int questionId, String questionData) {
		Question temp = new Question(questionId,questionData);
		gameTheory.replace(questionId,temp);
		for (int i = 1; i<=quizzical.size();i++){
			quizzical.get(i).updateQuestions(gameTheory, questionId);
		}
	}

}
