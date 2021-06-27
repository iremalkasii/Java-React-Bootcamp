/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4homework2;

import day4homework2.Abstract.BaseCustomerManager;
import day4homework2.Concrate.NeroCustomerManager;
import day4homework2.Entities.Customer;

/**
 *
 * @author lenovo
 */
public class Day4Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     BaseCustomerManager customerManager = new NeroCustomerManager(); 
     customerManager.Save(new Customer(15,"Engin","Demiroğ","15623645"));
    }
    
}
