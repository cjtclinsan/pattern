package com.example.pattern.factory.abstractfactory;

import com.example.pattern.factory.ICourse;
import com.example.pattern.factory.JavaCourse;

/**
 * @author woshi
 * @title: JavaCourseFactory
 * @projectName pattern
 * @date 2019/3/14 10:39
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public Inote createNote() {
        return new JavaNote();
    }

    @Override
    public Ibook createBook() {
        return new JavaBook();
    }
}
