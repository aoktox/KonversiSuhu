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
public class Reamur {
    KonversiSuhu SA = new KonversiSuhu();
    double toFahrenheit(){
        //°F = °Ré × 2,25 + 32
        return (SA.SuhuAwal*2.25+32);
    }
    double toKelvin(){
        //K = °Ré / 0,8 + 273,15
        return (SA.SuhuAwal/0.8+237.15);
    }
    double toCelcius(){
        //°C = °Ré / 0,8
        return (SA.SuhuAwal/0.8);
    }
}
