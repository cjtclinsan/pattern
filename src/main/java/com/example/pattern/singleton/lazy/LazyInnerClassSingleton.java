package com.example.pattern.singleton.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if (lazyHolder.LAZY != null){
            throw new RuntimeException("已存在，不能构建");
        }
    };

    public static final LazyInnerClassSingleton getInstance(){
        return lazyHolder.LAZY;
    }

    private static class lazyHolder{
        private static final LazyInnerClassSingleton LAZY
                = new LazyInnerClassSingleton();
    }
}