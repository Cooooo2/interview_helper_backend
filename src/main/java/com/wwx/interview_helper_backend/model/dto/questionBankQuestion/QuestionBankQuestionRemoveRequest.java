package com.wwx.interview_helper_backend.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionBankQuestionRemoveRequest implements Serializable {
    /**
     * 题库 id
     */
    private long questionBankId;

    /**
     * 题目 id
     */
    private long questionId;

    private static final long serialVersionUID = 1L;
}
