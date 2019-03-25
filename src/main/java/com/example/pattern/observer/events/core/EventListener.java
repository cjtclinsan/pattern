package com.example.pattern.observer.events.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器，它就是观察者
 */
public class EventLisenter {
    /**JDK底层lisenter也是这么设计的*/
    protected Map<String, Event> events = new HashMap<>();

    /**事件名称和一个目标对象来触发事件*/
    public void addLisenter(String eventType, Object target){
        try {
            this.addLisenter(
                    eventType,
                    target,
                    target.getClass().getMethod("on"+ toUpperFirstCase(eventType),Event.class)
            );
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void addLisenter(String eventType, Object target, Method callback){
        events.put(eventType, new Event(target, callback));
    }

    /**触发，只要有动作就触发*/
    public void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        //发起回调
        if( event.getCallback() != null ){
            try {
                //用反射调用它的回调函数
                event.getCallback().invoke(event.getTarget(), event);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /**事件名称触发*/
    protected void trigger(String trigger){
        if( !this.events.containsKey(trigger)){
            return;
        }
        trigger(this.events.get(trigger).setTrigger(trigger));
    }

    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] += 32;
        return chars.toString();
    }
}