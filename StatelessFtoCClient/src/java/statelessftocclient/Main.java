/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelessftocclient;

import java.util.Scanner;
import javax.ejb.EJB;
import mybeans.FtoCBeanRemote;

/**
 *
 * @author jiapat
 */
public class Main {

    @EJB
    private static FtoCBeanRemote ftoCBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        double F = inp.nextDouble();
        System.out.printf("%.2f Fahrenheit = %.2f Celsius", F, ftoCBean.fToC(F));
        inp.close();
    }
    
}
