package com.wenbin.design.pattern.factory.simple;

public class SimpleFactoryTest2 {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        factory.create("java").record();
    }
}
