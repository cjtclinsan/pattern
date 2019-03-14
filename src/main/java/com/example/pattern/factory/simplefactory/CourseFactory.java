package com.example.pattern.factory.simplefactory;

import com.example.pattern.factory.ICourse;

public class CourseFactory {
//    public ICourse create(String name){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else {
//            return null;
//        }
//    }

    public ICourse create(Class clazz){
        try {
            if( null != clazz ){
                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
