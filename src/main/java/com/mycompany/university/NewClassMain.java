/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author hp
 */
public class NewClassMain {
    
    public static void main (String [] args) {
//        (String id, double gpa, University uni, String firstName, String secondName, int age)
        Student student = new Student("ref1", 4.0, new University("ltuc", "Jordan"), "Abdel salam", "Shehadeh", 22);
        
        System.out.println("Student ID: " + student.getId() + '\n' + "GPA: " + student.getGpa() + '\n' + student.getUni() + '\n' + "First Name: " + student.getFirstName() + '\n' + "Second Name: " + student.getSecondName() + '\n' + "Age: " + student.getAge());
        
    }
    
}
