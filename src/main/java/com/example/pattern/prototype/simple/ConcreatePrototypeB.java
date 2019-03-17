package com.example.pattern.prototype;

import java.util.List;

public class ConcreatePrototypeB implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    @Override
    public Prototype clone() {
        ConcreatePrototypeB concreatePrototype = new ConcreatePrototypeB();
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