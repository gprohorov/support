package com.angular.support.model;

import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private LocalDateTime date;
    private  int mark;

    public Student(int id, String name, LocalDateTime date, int mark) {
        this.id = id;
        this.name = name;
        this.date = date;
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
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
