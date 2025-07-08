package ru.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Ivanov");
        student.setGroup("Artist");
        student.setEntered(new Date());

        System.out.println("Student Name: " + student.getFullName());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Entered: " + student.getEntered());
    }

}
