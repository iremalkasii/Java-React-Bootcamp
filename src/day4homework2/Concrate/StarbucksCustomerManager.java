/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4homework2.Concrate;

import day4homework2.Abstract.BaseCustomerManager;
import day4homework2.Abstract.CustomerCheckService;
import day4homework2.Entities.Customer;

/**
 *
 * @author lenovo
 */
public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        customerCheckService = _customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (_customerCheckService.CheckIfRealPerson(customer)) {
            {
                super.Save(customer); //To change body of generated methods, choose Tools | Templates.
            } 
            
          
          
        }
    }

}
