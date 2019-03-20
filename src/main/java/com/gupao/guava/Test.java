package com.gupao.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by xuhuan on 2019/3/20.
 */
public class Test {
    public static void main(String[] args) {
        String content = "请问如何才能把设计模式学好？";
        Question question = new Question();
        question.setAuthor("张三");
        question.setContent(content);

        GPerQuestion gPerQuestion = new GPerQuestion(question);
        gPerQuestion.send();

        GPerEvent event = new GPerEvent();
        //初始化消息总线
        EventBus eventBus = new EventBus();
        // 注册订阅者
        eventBus.register(event);
        // Event推送给订阅者
        eventBus.post(question);


    }
}
