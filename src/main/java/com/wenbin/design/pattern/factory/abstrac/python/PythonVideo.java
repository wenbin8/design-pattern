package com.wenbin.design.pattern.factory.abstrac.python;

import com.wenbin.design.pattern.factory.abstrac.IVideo;

public class PythonVideo implements IVideo {
    public void record() {
        System.out.println("录制Python视频");
    }
}
