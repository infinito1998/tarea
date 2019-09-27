/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laboratorio2
 */
public class Estadistica {
    
    private int anoVehiculo;
    private double ValorUF;
    private int Valor;
    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
   
    public int getAnoVehiculo() {
        return anoVehiculo;
    }

    public void setAnoVehiculo(int anoVehiculo) {
        this.anoVehiculo = anoVehiculo;
    }
    
    public double getValorUF() {
        return ValorUF;
    }

    public void setValorUF(double ValorUF) {
        this.ValorUF = ValorUF;
    }
    public int obtenerUF(){
        int anos=2019-anoVehiculo;
        int costo;

            if(anos<=10){
                if(anos<1){
                    Valor=(int) (ValorUF/10);

                }
                else{
                   Valor=(int) (ValorUF*anos/10); 

                }
            }
        return Valor;
    }
   
}
