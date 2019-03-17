package com.example.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototypetest {
    public static void main(String[] args) {
        ConcreatePrototype concreatePrototype = new ConcreatePrototype();
        concreatePrototype.setName("tttc");
        concreatePrototype.setAge(20);

        List<String> hobbies = new ArrayList<>();

        concreatePrototype.setHobbies(hobbies);

        Client client = new Client();
        ConcreatePrototype copy = (ConcreatePrototype) client.startClone(concreatePrototype);
        System.out.println(copy);

        System.out.println("克隆对象中引用类型对象的值"+copy.getHobbies());
        System.out.println("原对象中引用类型对象的值"+concreatePrototype.getHobbies());
        System.out.println(copy.getHobbies() == concreatePrototype.getHobbies());
    }
}