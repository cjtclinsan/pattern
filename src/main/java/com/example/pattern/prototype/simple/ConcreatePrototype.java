package com.example.pattern.prototype;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.List;

public class ConcreatePrototype implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    @Override
    public Prototype clone() {
        ConcreatePrototype concreatePrototype = new ConcreatePrototype();
        concreatePrototype.setAge(this.age);
        concreatePrototype.setHobbies(this.hobbies);
        concreatePrototype.setName(this.name);
        return concreatePrototype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}