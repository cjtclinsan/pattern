package com.example.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazySimpleSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if( lazySimpleSingleton == null ){
            synchronized (LazyDoubleCheckSingleton.class){
                if( lazySimpleSingleton == null ){
                    lazySimpleSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }
}