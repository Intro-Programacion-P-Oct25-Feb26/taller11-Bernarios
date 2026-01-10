/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ciudades = arregloCiudades();
        imprimirCiudades(ciudades);

    }

    public static String[] arregloCiudades() {
        int elementos;
        System.out.println("Ingrese el número de elementos del arreglo");
        elementos = entrada.nextInt();

        entrada.nextLine();
        String[] ciudades = new String[elementos];
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de las ciudades");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }

    public static void imprimirCiudades(String[] a) {
        System.out.println("\nCiudades:");
        for (int i = 0; i < a.length; i++) {
            int longitud = a[i].length();
            if ((longitud == 4) || (longitud == 5)) {
                System.out.println(a[i]);
            }
        }

    }

}
