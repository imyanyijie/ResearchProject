package Servlet;

import java.util.*;

import Model.Answer;
import Model.AnswerTable_API;
import Model.AnswerTable_MySQLImpl;
import Model.QuestionTable_API;
import Model.QuestionTable_MySQLImpl;
import Model.Question;

public class Persistence_Impl implements Persistence_API{
	private static Persistence_API instance;
	private Persistence_Impl(){
	}
	
	public static synchronized Persistence_API getInstance() {

	    if (instance == null) {
	      instance = new Persistence_Impl();
	    }

	    return instance;
	  }

	
	
	@Override
	public void addAnswer(Answer a) {
		// TODO Auto-generated method stub
		// this method will add answer to the AnswerTable which is a list type
		AnswerTable_API A=AnswerTable_MySQLImpl.getInstance();
		A.addAnswer(a);
	}

	@Override
	public List<Question>getQuestion() {
		List<Question> question= new ArrayList();
		// TODO Auto-generated method stub
		//this will return a Question table which is a list. 
		QuestionTable_API Q=QuestionTable_MySQLImpl.getInstance();
		question=Q.getQuestions();
		return question;
		
		
		
	}

	@Override
	public void addQuestion(QuestionTable_MySQLImpl q) {
		// TODO Auto-generated method stub
		
	}

}