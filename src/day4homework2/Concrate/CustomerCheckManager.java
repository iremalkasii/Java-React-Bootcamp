/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4homework2.Concrate;

import day4homework2.Abstract.CustomerCheckService;
import day4homework2.Abstract.CustomerServiice;
import day4homework2.Entities.Customer;
import java.lang.ref.Reference;


/**
 *

 */
class CustomerCheckManager implements CustomerCheckService {

   

    @Override
    public boolean CheckIfRealPErson(Customer customer) {
		return true;
       
     
            }

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }

  

    
}
