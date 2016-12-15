package Servlet;

import java.util.List;

import Model.Answer;
import Model.QuestionTable_MySQLImpl;
import Model.Question;

public interface Persistence_API {
	List<Question> getQuestion();
	void addAnswer(Answer a);
	void addQuestion(QuestionTable_MySQLImpl q);
	
}
