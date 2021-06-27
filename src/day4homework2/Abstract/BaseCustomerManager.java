/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4homework2.Abstract;

import day4homework2.Entities.Customer;

/**
 *
 * @author lenovo
 */
public class BaseCustomerManager implements CustomerServiice{

    @Override
    public void Save(Customer customer) {
        System.out.println("Sadev to db :"+  customer.getFirstName()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
