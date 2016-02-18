/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Иван
 */
@Stateless
public class TimeBean implements TimeBeanLocal {

    @Override
    public Date getMessage() {
        Date d = new Date(System.currentTimeMillis());
       return d; 
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
