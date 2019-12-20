package com.angular.support.model;

import java.time.LocalDate;

public class Exam {
    private int id;
    private LocalDate date;
    private Student student;
    private int mark;

    public Exam(int id, LocalDate date, Student student, int mark) {
        this.id = id;
        this.date = date;
        this.student = student;
        this.mark = mark;
    }

    public Exam(LocalDate date, Student student, int mark) {
        this.date = date;
        this.student = student;
        this.mark = mark;
    }

    public Exam(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", date=" + date +
                ", student=" + student +
                ", mark=" + mark +
                '}';
    }
}
