package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.revature.entities.Answer;
import com.revature.entities.Question;
import com.revature.repositories.AnswerRepository;

@Service
public class AnswerService {
	
 @Autowired
 AnswerRepository answerRepository;
 
  /** @Author Natasha Poser */
 public Page<Answer> getAnswerByQuestionId(Pageable pageable, int question_id){
	 return answerRepository.getAnswerByQuestionId(pageable, question_id);
 }
	
	/** @Author James Walls */
	public Answer save(Answer answer) {
		return answerRepository.save(answer);
	}

	/**@author ken*/
	public Page<Answer> getAllAnswersByUserID(Pageable pageable, int id){
		return answerRepository.getAllAnswersByUserId(pageable, id);		
	}

	public Page<Answer> getAnswers(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/** @author Natasha Poser */
	public Page<Answer> getAcceptedAnswerByQuestionId(Pageable pageable, int question_id){
		return answerRepository.getAcceptedAnswerByQuestionId(pageable, question_id);
	}
	
}


