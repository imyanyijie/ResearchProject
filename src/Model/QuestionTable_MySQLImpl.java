package Model;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.glassfish.external.statistics.Statistic;

import Servlet.Persistence_API;

public class QuestionTable_MySQLImpl implements QuestionTable_API  {
	
	
	private static QuestionTable_API instance;
	  
	  private QuestionTable_MySQLImpl() {
	  }
	  public static QuestionTable_API getInstance() {

		    if (instance == null) {
		      instance = new QuestionTable_MySQLImpl();
		    }

		    return instance;
		  }
	  

	@Override
	public void addQuestion(Question q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
