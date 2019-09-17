package com.wenbin.design.principles.dip;

public class Tom3 {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }

    public static void main(String[] args) {
        Tom3 tom3 = new Tom3();
        tom3.setCourse(new JavaCourse());
        tom3.study();

        tom3.setCourse(new PythonCourse());
        tom3.study();
    }
}
