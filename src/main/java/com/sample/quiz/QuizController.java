package com.sample.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.quiz.repository.OptionsRepository;
import com.sample.quiz.repository.QuestionRepository;

@RestController
public class QuizController {

	@Autowired
	QuestionRepository questionRespository;

	@Autowired
	OptionsRepository optionsRespository;

	@GetMapping("/question")
	public List<Question> getAllQuestionAndOptions() {
		return questionRespository.findAll();
	}

	// create a new question
	@PostMapping("/question")
	public void postQuestion(@RequestParam String quest, String option1, String option2, String option3,
			String option4) {
		Question question = new Question(quest);
		Options option = new Options(option1, option2, option3, option4);
		// saving the child reference in parent
		question.setOptions(option);
		// saving parent refernce in child
		option.setQuestion(question);
//		saving parent reference which also includes child
		questionRespository.save(question);

	}

}
