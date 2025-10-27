package com.questions.services;

import com.questions.entities.QuestionsEntity;

import java.util.List;

public interface QuestionService
{
    QuestionsEntity create(QuestionsEntity questions);

    List<QuestionsEntity> getAll();

    QuestionsEntity get(Long id);

    List<QuestionsEntity> getQuestionsOfQuizID(Long quizId);
}
