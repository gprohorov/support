package com.angular.support.model;

import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private LocalDateTime dateOfBirth;
    private  int mark;

    public Student(int id, String name, LocalDateTime date, int mark) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = date;
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

    public LocalDateTime getDate() {
        return dateOfBirth;
    }

    public void setDate(LocalDateTime date) {
        this.dateOfBirth = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
