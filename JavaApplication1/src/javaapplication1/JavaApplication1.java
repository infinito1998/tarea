/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import clases.Datos;
import clases.Estadistica;
import java.util.Scanner;

/**
 *
 * @author laboratorio2
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datos datos = new Datos();
        Estadistica estadistica = new Estadistica();
        solicitarMarca();
        datos.setMarca(capturarMarca());
        solicitarModelo();
        datos.setModelo(capturarModelo());
        solicitarValorUF();
        estadistica.setValorUF(capturarValorUF());
        solicitarAno();
        estadistica.setAnoVehiculo(capturarAnoVehiculo());
        mostrarValorUF(estadistica);
        
        
    }

    private static void solicitarMarca() {
        System.out.print("Ingrese Marca de Auto:");
    }
    private static String capturarMarca(){
        String Marca;
        Scanner scanner = new Scanner(System.in);
        Marca= scanner.nextLine();
        return Marca;
    }

    private static void solicitarModelo() {
        System.out.print("Ingrese Modelo de auto: ");
    }

    private static String capturarModelo() {
        Scanner scanner = new Scanner (System.in);
        String Modelo = scanner.nextLine();
        return Modelo;
    }

    private static void solicitarValorUF() {
        System.out.print("Ingrese Valor UF: ");
    }

    private static double capturarValorUF() {
        Scanner scanner = new Scanner(System.in);
        double ValorUF = scanner.nextDouble();
        return ValorUF;
    }

    private static void solicitarAno() {
        System.out.println("Ingrese Año de Vehiculo: ");
    }

    private static int capturarAnoVehiculo() {
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();
        return ano;
    }

    private static void mostrarValorUF(Estadistica estadistica) {
        int ano=estadistica.getAnoVehiculo();
        int anos=2019-ano;
        if(anos<=10){
        System.out.println("Valor en UF: "+estadistica.obtenerUF());
    }
        else{
            System.out.println("Vehiculo no Asegurable");
        }
    }
    
    
}
