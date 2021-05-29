/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3homework2;

import java.util.Arrays;

/**
 *
 * @author lenovo
 */
public class Day3homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] showUsers;

        Student student1 = new Student("İrem", "Alkasi", "1");

        String[] courses = {"Java-React", "C# Angular"};
        student1.setCourses(courses);
        student1.getCourses();

        String[] homework = {"1.gün", "2.gün", "3.gün"};
        student1.setHomeworks(homework);
        
        showUsers = student1.getHomeworks();

        for (String n : showUsers) {

            System.out.println(n);

        }

        Instructor ınstructor1 = new Instructor("Engin", "Demiroğ", "1");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.deleteUser(student1);

        InstructorManager ınstructorManager = new InstructorManager();
        ınstructorManager.add(ınstructor1);
        ınstructorManager.deleteUser(ınstructor1);
        ınstructorManager.addLesson("Java-React");

        // TODO code application logic here
    }

}
