package com.sample.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.quiz.Options;
import com.sample.quiz.Question;


@Repository
public interface OptionsRepository extends JpaRepository<Question, Integer>{
	
}
