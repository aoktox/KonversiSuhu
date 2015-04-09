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
public class Kelvin {
    KonversiSuhu SA = new KonversiSuhu();
    double toFahrenheit(){
        //°F = K × 1,8 − 459,67
        return (SA.SuhuAwal*1.8-459.67);
    }
    double toReamur(){
        //°Ré = (K − 273,15) × 0,8
        return ((SA.SuhuAwal-273.15)*0.8);
    }
    double toCelcius(){
        //°C = K − 273,15
        return (SA.SuhuAwal-273.15);
    }
}
