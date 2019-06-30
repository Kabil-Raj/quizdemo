package com.sample.quiz;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
@Table(name = "Question")
public class Question {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE,generator = "seq")
	@Column (name="question_id")
	private int id;
	
	@Column (name="question")
	private String question;
	
	@OneToOne(mappedBy = "question" , cascade = CascadeType.ALL)
	private Options options;
	
	
	public Question(String question) {
		setQuestion(question);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question() {
		
	}


	public Options getOptions() {
		return options;
	}


	public void setOptions(Options option) {
		this.options = option;
	}
	

	
	
}
