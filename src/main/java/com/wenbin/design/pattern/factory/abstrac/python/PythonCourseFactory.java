package com.wenbin.design.pattern.factory.abstrac.python;

import com.wenbin.design.pattern.factory.abstrac.CourseFactory;
import com.wenbin.design.pattern.factory.abstrac.INote;
import com.wenbin.design.pattern.factory.abstrac.IVideo;

public class PythonCourseFactory implements CourseFactory {
    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
