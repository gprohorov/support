package com.angular.support.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private  int mark;

    public Student(int id, String name, LocalDate date, int mark) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = date;
        this.mark = mark;
    }



    public Student(String name, String dateOfBirth, int mark) {
        this.name = name;
        System.out.println("---------------------");
        System.out.println(dateOfBirth);
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
       this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return dateOfBirth;
    }

    public void setDate(LocalDate date) {
        this.dateOfBirth = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", mark=" + mark +
                '}';
    }
}
