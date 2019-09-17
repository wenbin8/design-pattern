package com.wenbin.design.pattern.factory.method;

import com.wenbin.design.principles.dip.ICourse;

public class MethodFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();

        ICourse course = factory.create();
        course.study();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.study();
    }
}
