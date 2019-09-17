package com.wenbin.design.pattern.factory.method;

import com.wenbin.design.principles.dip.ICourse;
import com.wenbin.design.principles.dip.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
