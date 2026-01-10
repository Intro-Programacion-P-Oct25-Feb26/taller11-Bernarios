/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double promedio = obtenerMedia(informacion);

        double desviacion = obtenerDesviacion(informacion, promedio);

        System.out.printf("Media aritmética: %.2f\n", promedio);
        System.out.printf("Desviación estándar: %.2f", desviacion);
    }

    public static double obtenerMedia(int[] a) {
        int suma = 0;
        double promedio;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];

        }
        promedio = suma / a.length;
        return promedio;

    }

    public static double obtenerDesviacion(int[] a, double b) {
        double suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + Math.pow(a[i] - b, 2);
        }
        double varianza = suma / a.length;
        return Math.sqrt(varianza);

    }

}
