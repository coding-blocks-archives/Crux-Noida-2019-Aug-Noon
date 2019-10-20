package com.company.Lec16;

public class JavaTeacher implements Teacher {
    @Override
    public void study() {
        System.out.println("I study like a java Teacher");
    }

    @Override
    public void teach() {
        System.out.println("I teach like a good Teacher ");
    }

    @Override
    public void Lecture() {
        System.out.println("lecture");
    }
}
