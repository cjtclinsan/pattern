package com.example.pattern.factory.factorymethod;

import com.example.pattern.factory.Cpp;
import com.example.pattern.factory.ICourse;

/**
 * @author woshi
 * @title: CppFactory
 * @projectName pattern
 * @date 2019/3/14 11:46
 */
public class CppFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new Cpp();
    }
}
