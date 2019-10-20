package com.company.Lec16;

public class TeachingAssitant implements Teacher,Student {


    @Override
    public void sleep() {
        System.out.println("I sleep like a student");
    }

    @Override
    public void study() {
        System.out.println("I study more like student");
    }

    @Override
    public void teach(){

        System.out.println("I teach more like Teacher");
    }

    @Override
    public void Lecture() {
        System.out.println("Lecture");
    }
}
