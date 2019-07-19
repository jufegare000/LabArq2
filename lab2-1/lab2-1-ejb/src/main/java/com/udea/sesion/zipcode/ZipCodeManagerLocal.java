/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.sesion.zipcode;

import com.udea.model.MicroMarket;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf.gallo
 */
@Local
public interface ZipCodeManagerLocal {

    List<MicroMarket> getZipCodes();
    
}
