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
public class InstructorManager extends UserManager{
    
    
    
    @Override
    public void add(User user){
        System.out.println("Eğitimci eklendi.");
        
    }
    @Override
    public void deleteUser(User user){
         
         System.out.println(user.getName() + user.getLastName()+ user.getUserId()+ " eğitmen başarıyla silindi.");
     }
    @Override
      public void updateUser(User user){
          
          System.out.println(user.getName()+ user.getLastName() + user.getUserId()+ "eğitmen başarıyla güncellendi.");
      }
    public void addLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla eklendi.");
	}
	
	public void updateLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla güncellendi.");
	}
    
}
