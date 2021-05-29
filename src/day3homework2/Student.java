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
public class Student extends User {
     private String[] Courses;
     private String[] homeworks;

    public Student(String name, String lastName, String userId) {
        super(name, lastName, userId);
    }

    public String[] getCourses() {
        return Courses;
    }

    public void setCourses(String[] Courses) {
        this.Courses = Courses;
    }

    public String[] getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(String[] homeworks) {
        this.homeworks = homeworks;
    }
    
    public void addCourse(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla eklendi.");
	}
	
	public void deleteCourse(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla silindi.");
	}

  
      
     

     
     
}
