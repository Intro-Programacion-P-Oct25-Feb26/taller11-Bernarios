/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] listaVivienda = obtenerViviendas();

        double[][] matrizConsumo = obtenerConsumo(listaVivienda);

        double[] totalesAnual = calcularSumaTotal(matrizConsumo);
    }

    public static String[] obtenerViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];

        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Ingrese nombre de vivienda " + (i + 1) + ":");
            viviendas[i] = entrada.nextLine();
        }
        return viviendas;
    }

    public static double[][] obtenerConsumo(String[] viviendas) {
        Scanner entrada = new Scanner(System.in);
        double[][] consumos = new double[10][12];

        for (int i = 0; i < consumos.length; i++) {
            System.out.println("Vivienda: " + viviendas[i]);
            for (int j = 0; j < consumos[i].length; j++) {
                System.out.print("   Mes " + (j + 1) + ": ");
                consumos[i][j] = entrada.nextDouble();
            }
        }
        return consumos;
    }

    public static double[] calcularSumaTotal(double[][] consumos) {
        double[] sumaViviendas = new double[consumos.length];

        for (int i = 0; i < consumos.length; i++) {
            double sumaFila = 0;
            for (int j = 0; j < consumos[i].length; j++) {
                sumaFila = sumaFila + consumos[i][j];
            }
            sumaViviendas[i] = sumaFila;
        }
        return sumaViviendas;
    }

    public static void presentarReporte(String[] viviendas, double[] totales) {
        String cadenaReporte = "";

        cadenaReporte = String.format("%s\n%s\t\t%s\n", cadenaReporte,
                "Vivienda", "Consumo Anual Total");

        for (int i = 0; i < viviendas.length; i++) {
            cadenaReporte = String.format("%s%s\t\t%.2f\n",
                    cadenaReporte,
                    viviendas[i],
                    totales[i]);
        }

        System.out.printf("%s\n",cadenaReporte);
    }
}
