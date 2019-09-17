package com.wenbin.design.pattern.factory.abstrac.java;

import com.wenbin.design.pattern.factory.abstrac.IVideo;

public class JavaVideo implements IVideo {
    public void record() {
        System.out.println("录制Java视频");
    }
}
