package com.wenbin.design.pattern.factory.simple;

public class CourseFactory1 {
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
