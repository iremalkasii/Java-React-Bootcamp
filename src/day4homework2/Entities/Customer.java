/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4homework2.Entities;

/**
 *
 * @author lenovo
 */
public class Customer {
    public int Id;
    String firstName;
    String lastName;
    String dateOfBirth;
    String nationalityId;

    public Customer(int Id, String firstName, String lastName, String nationalityId) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
    }
    
 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String NationalityId) {
        this.nationalityId = NationalityId;
    }
    
    
    
}
