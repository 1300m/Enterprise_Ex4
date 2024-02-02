/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author jiapat
 */
@Stateless
public class FtoCBean implements FtoCBeanRemote {

    @Override
    public double fToC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
    
}
