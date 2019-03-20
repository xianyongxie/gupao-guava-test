package com.gupao.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by xuhuan on 2019/3/20.
 */
public class GPerEvent {
    @Subscribe
    public void subscribe(Question question){
        System.out.println("老师你好，你收到了一条来自："+question.getAuthor()+
                "同学的提问："+question.getContent());
    }
}
