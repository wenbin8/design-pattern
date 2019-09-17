package com.wenbin.design.pattern.factory.abstrac;

import com.wenbin.design.pattern.factory.abstrac.java.JavaCourseFactory;

public class AbsFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }
}
