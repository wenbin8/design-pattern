package com.wenbin.design.principles.dip;

public class Tom1 {
    public void studyJavaCourse() {
        System.out.println("Tom在学习Java课程");
    }

    public void studyPythonCourse() {
        System.out.println("Tom在学习Python的课程");
    }

    public static void main(String[] args) {
        Tom1 tom1 = new Tom1();

        tom1.studyJavaCourse();
        tom1.studyPythonCourse();
    }
}
