package educational.entertainment.models;

public class Choice {

	String fullChoice;
	int choiceID;
	int questionID;
	boolean correct;
	
	public String getFullChoice() {
		return fullChoice;
	}
	public void setFullChoice(String fullChoice) {
		this.fullChoice = fullChoice;
	}
	public int getChoiceID() {
		return choiceID;
	}
	public void setChoiceID(int choiceID) {
		this.choiceID = choiceID;
	}
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
}
