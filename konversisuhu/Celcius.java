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
public class Celcius {
    KonversiSuhu SA = new KonversiSuhu();
    double toFahrenheit(){
        //°F = °C × 1,8 + 32
        return (SA.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //°Ré = °C × 0,8
        return (SA.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = °C + 273,15
        return (SA.SuhuAwal+273.15);
    }
}