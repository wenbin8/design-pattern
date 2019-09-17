package com.wenbin.design.pattern.factory.simple;

public class SimpleFactoryTest3 {
    public static void main(String[] args) {
        CourseFactory1 courseFactory1 = new CourseFactory1();

        ICourse course = courseFactory1.create(JavaCourse.class);
        course.record();

    }
}
