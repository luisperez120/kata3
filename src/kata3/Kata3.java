/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import sun.awt.windows.WToolkit;

/**
 *
 * @author Luis Pérez
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram histo = new Histogram();
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("uam.es");
        histo.increment("uam.es");
        histo.increment("uam.es");
        histo.increment("uam.es");
        histo.increment("ull.es");
        histo.increment("upv.es");
        histo.increment("upv.es");
        histo.increment("ull.es");
        
        
        HistogramDisplay dis= new HistogramDisplay(histo);
        dis.execute();
                
    }
    
}
