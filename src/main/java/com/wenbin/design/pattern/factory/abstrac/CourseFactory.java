package com.wenbin.design.pattern.factory.abstrac;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用的最为广泛的一种设计模式
 * 易于扩展
 */
public interface CourseFactory {
    INote createNote();

    IVideo createVideo();
}