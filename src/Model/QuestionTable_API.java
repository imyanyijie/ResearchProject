package Model;

import java.util.List;

public interface QuestionTable_API {
	void addQuestion(Question q);
	List<Question> getQuestions();
}
