package com.questions.services;

import com.questions.entities.QuestionsEntity;
import com.questions.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public QuestionsEntity create(QuestionsEntity questions) {
        return questionRepository.save(questions);
    }

    @Override
    public List<QuestionsEntity> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public QuestionsEntity get(Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question not found"));
    }

    @Override
    public List<QuestionsEntity> getQuestionsOfQuizID(Long quizId) {
        return questionRepository.getFindByQuizId(quizId);
    }
}
