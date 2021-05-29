/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3homework2;

/**
 *
 * @author lenovo
 */
public class Instructor extends User{

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }
    String[] lessons;

    public Instructor(String name, String lastName, String userId) {
        super(name, lastName, userId);
    }
     
    
    
    
    
}
