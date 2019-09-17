package com.wenbin.design.principles.dip;

public class Tom2 {
    private ICourse course;

    public Tom2(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }

    public static void main(String[] args) {
        Tom2 tom2 = new Tom2(new JavaCourse());
        tom2.study();
    }
}
