package Model;

import java.util.List;

import Servlet.Persistence_API;

public class Answer {
	private int questionID;
	private int choiceID;
	
	public Answer(int questionID, int choiceID) {
		super();
		this.questionID = questionID;
		this.choiceID = choiceID;
	}
	
	public int getQuestionID() {
		return questionID;
	}
	
	public int getchoiceID() {
		return choiceID;
	}

}
