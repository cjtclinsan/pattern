package com.example.pattern.factory.abstractfactory;

import com.example.pattern.factory.ICourse;
import com.example.pattern.factory.PythonCourse;

/**
 * @author woshi
 * @title: PythonFactory
 * @projectName pattern
 * @date 2019/3/14 10:42
 */
public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public Inote createNote() {
        return null;
    }

    @Override
    public Ibook createBook() {
        return null;
    }
}
