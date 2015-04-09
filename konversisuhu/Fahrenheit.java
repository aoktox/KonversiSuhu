/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author Agus
 */
public class Fahrenheit {
    KonversiSuhu SA = new KonversiSuhu();
    double toReamur(){
        //°Ré = (°F − 32) / 2,25
        return ((SA.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        //K = (°F + 459,67) / 1,8
        return ((SA.SuhuAwal+459.67)/ 1.8);
    }
    double toCelcius(){
        //°C = (°F − 32) / 1,8
        return ((SA.SuhuAwal-32)/1.8);
    }
}
