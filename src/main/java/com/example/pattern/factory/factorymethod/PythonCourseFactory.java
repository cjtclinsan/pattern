package com.example.pattern.factory.factorymethod;

import com.example.pattern.factory.ICourse;
import com.example.pattern.factory.PythonCourse;

/**
 * @author woshi
 * @title: PythonCourseFactory
 * @projectName pattern
 * @date 2019/3/14 9:20
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
