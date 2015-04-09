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
public class HitungKonversiSuhu {
    KonversiSuhu SA = new KonversiSuhu();
    //Celcius
    double CelciustoFahrenheit(){
        double hasil;
        hasil=(1.8*SA.SuhuAwal)+32;
        return hasil;
    }
    double CelciustoKelvin(){
        double hasil;
        hasil=SA.SuhuAwal+273.15;
        return hasil;
    }
    double CelciustoReamur(){
        double hasil;
        hasil=SA.SuhuAwal*0.8;
        return hasil;
    }
}