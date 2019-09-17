package com.wenbin.design.pattern.factory.method;

import com.wenbin.design.principles.dip.ICourse;
import com.wenbin.design.principles.dip.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
