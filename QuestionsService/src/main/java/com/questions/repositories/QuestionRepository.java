package com.questions.repositories;

import com.questions.entities.QuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionsEntity,Long> {
    List<QuestionsEntity> getFindByQuizId(Long quizId);
}
