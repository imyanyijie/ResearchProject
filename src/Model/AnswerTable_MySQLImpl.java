package Model;

import java.util.List;


public class AnswerTable_MySQLImpl implements AnswerTable_API  {

	  private int UserID;
	  private int QuestionID;
	  private String Answers;
	  private static AnswerTable_API instance;
	  
	  private AnswerTable_MySQLImpl() {
	  }
	  public static AnswerTable_API getInstance() {

		    if (instance == null) {
		      instance = new AnswerTable_MySQLImpl();
		    }

		    return instance;
		  }
	  
	  
	@Override
	public void addAnswer(Answer a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Answer> getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}


}
