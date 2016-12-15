package Model;

public class Choice {
	private int choiceID;
	private String text;
	
	public Choice(int choiceID, String text) {
		this.choiceID = choiceID;
		this.text = text;
	}

	public int getChoiceID() {
		return choiceID;
	}

	public String getText() {
		return text;
	}
	
}
