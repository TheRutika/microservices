package com.questions.controllers;

import com.questions.entities.QuestionsEntity;
import com.questions.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public QuestionsEntity create(@RequestBody QuestionsEntity questions)
    {
        return questionService.create(questions);
    }

    @GetMapping
    public List<QuestionsEntity> getAll()
    {
        return questionService.getAll();

    }

    @GetMapping("/{questionId}")
    public QuestionsEntity getOne(@PathVariable Long questionId)
    {
        return questionService.get(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<QuestionsEntity> getQuestionsOfQuizID(@PathVariable Long quizId)
    {
        return questionService.getQuestionsOfQuizID(quizId);
    }

}
