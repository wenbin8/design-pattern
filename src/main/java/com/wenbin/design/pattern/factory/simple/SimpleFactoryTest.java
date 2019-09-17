package com.wenbin.design.pattern.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICourse course = new JavaCourse();

        course.record();
    }
}
