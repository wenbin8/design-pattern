package com.wenbin.design.pattern.observer.gp;

public class GPerTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher t1 = new Teacher("t1");
        Teacher t2 = new Teacher("t2");

        gPer.addObserver(t1);
        gPer.addObserver(t2);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于那些场景？");

        gPer.publishQuesttion(question);
    }
}
