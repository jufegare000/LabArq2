/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.sesion.customer.CustomerManagerLocal;
import com.udea.sesion.discount.DiscountCodeManagerLocal;
import com.udea.sesion.zipcode.ZipCodeManagerLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author juanf.gallo
 */
@Named(value = "CustomerMBean")
@SessionScoped
public class CustomerMBean implements Serializable{

    @EJB
    private DiscountCodeManagerLocal discountCodeManager;

    @EJB
    private CustomerManagerLocal customerManager;

    @EJB
    private ZipCodeManagerLocal zipCodeManager;
    
    
    

    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerMBean() {
    }
    
    
}
