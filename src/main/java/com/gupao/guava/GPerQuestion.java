package com.gupao.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by xuhuan on 2019/3/20.
 */
public class GPerQuestion {

    private Question question;

    public GPerQuestion(Question question){
        this.question = question;
    }

    public void send(){
        System.out.println(question.getAuthor()+"发布了一个问题："+question.getContent());
    }
}
