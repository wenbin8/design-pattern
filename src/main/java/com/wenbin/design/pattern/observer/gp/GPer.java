package com.wenbin.design.pattern.observer.gp;

import java.util.Observable;

public class GPer extends Observable {
    private String name = "Gper 生态圈";
    private static GPer gPer = null;

    private GPer() { }

    public static GPer getInstance() {
        if (null == gPer) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuesttion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
