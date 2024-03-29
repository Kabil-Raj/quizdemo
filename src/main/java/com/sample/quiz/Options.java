package com.sample.quiz;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name="sequ", initialValue=1, allocationSize=100)
@Table(name="Options")
public class Options {

	@OneToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE,generator = "sequ")
	@Column (name="options_id")
	private int optionsId;
	
	@Column (name="option1")
	private String option1;
	
	@Column (name="option2")
	private String option2;
	
	@Column (name="option3")
	private String option3;
	
	@Column (name="option4")
	private String option4;


	public Options() {
		
	}
	

	
	public Options(String choice1, String choice2, String choice3, String choice4) {
		this.setOption1(choice1);
		this.setOption2(choice2);
		this.setOption3(choice3);
		this.setOption4(choice4);
	}

	public int getOptionsId() {
		return optionsId;
	}

	public void setOptionsId(int id) {
		this.optionsId = id;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	
	
	
}