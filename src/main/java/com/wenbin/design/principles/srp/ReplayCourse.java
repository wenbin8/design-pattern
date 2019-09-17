package com.wenbin.design.principles.srp;

public class ReplayCourse {
    public void study(String courseName) {
        System.out.println(courseName + "可以反复回看");
    }

    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
