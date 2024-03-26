/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author hp
 */
public class Student extends Person {

    private String id;
    private double gpa;
    private University uni;

    public Student(String id, double gpa, University uni, String firstName, String secondName, int age) {
        super(firstName, secondName, age);
        this.id = id;
        this.gpa = gpa;
        this.uni = new University(uni.getName(), uni.getLocation());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }
    
}
