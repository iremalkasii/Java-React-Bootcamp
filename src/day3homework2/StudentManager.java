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
public class StudentManager extends UserManager{
       @Override
       public void add(User user){
           System.out.println(user.getName()+ user.getLastName() + user.getUserId()+ " öğrenci başarıyla eklendi.");
    }
       @Override
       public void deleteUser(User user){
         
         System.out.println(user.getName() + user.getLastName()+ user.getUserId() +" öğrenci başarıyla silindi");
     }
       @Override
      public void updateUser(User user){
          
          System.out.println(user.getName()+ user.getLastName() + user.getUserId()+ " öğrenci güncellendi.");
      }
       
   
    
       
       
       
       
}
