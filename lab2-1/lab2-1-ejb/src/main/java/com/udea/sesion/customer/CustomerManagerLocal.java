/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.sesion.customer;

import com.udea.model.Customer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf.gallo
 */
@Local
public interface CustomerManagerLocal {

    /**
     *
     * @param customer
     * @return
     */
    List<Customer> getAllCustomers(Customer customer);

    Customer update(Customer customer);
    
}
