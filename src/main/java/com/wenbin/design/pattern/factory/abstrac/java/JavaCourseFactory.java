package com.wenbin.design.pattern.factory.abstrac.java;

import com.wenbin.design.pattern.factory.abstrac.INote;
import com.wenbin.design.pattern.factory.abstrac.IVideo;

/**
 * 创建Java产品族的具体工厂
 */
public class JavaCourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
