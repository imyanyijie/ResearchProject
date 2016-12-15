package Model;

import java.util.List;

public class Question  {
	private int QuestionID;
	private String text;
	private List<Choice> choice;
	
	public Question(int QuestionID, String text, List<Choice> choice) {
		super();
		this.QuestionID = QuestionID;
		this.text = text;
		this.choice = choice;
	}

	

	public int getQuestionID() {
		return QuestionID;
	}

	public void setQuestionID(int questionID) {
		questionID = questionID;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public List<Choice> getChoice() {
		return choice;
	}



	public void setChoice(List<Choice> choice) {
		this.choice = choice;
	}


}