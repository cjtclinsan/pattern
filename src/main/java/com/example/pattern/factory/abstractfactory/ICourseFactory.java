package com.example.pattern.factory.abstractfactory;

import com.example.pattern.factory.ICourse;

/**
 * @author woshi
 * @title: ICourseFactory
 * @projectName pattern
 * @date 2019/3/14 10:34
 * 所有的子工厂都实现这个工厂
 */
public interface ICourseFactory {
    ICourse createCourse();

    Inote createNote();

    Ibook createBook();
}
