/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        String cedula;
        String nombre;

        System.out.println("Elija una opcion:1 valor de luz;2 valor del predio");
        opcion = entrada.nextInt();

        entrada.nextLine();

        if (opcion == 1) {
            System.out.println("Ingrese nombre y apellido");
            nombre = entrada.nextLine();
            System.out.println("Ingrese cedula");
            cedula = entrada.nextLine();
            calcularValorLuz(nombre, cedula);
        } else if (opcion == 2) {
            System.out.println("Ingrese nombre y apellido");
            nombre = entrada.nextLine();
            System.out.println("Ingrese cedula");
            cedula = entrada.nextLine();
            calcularPredio(nombre, cedula);
        } else {
            System.out.println("Ingrese una opcion correcta del 1 al 2");
        }
    }

    public static void calcularValorLuz(String n, String c) {
        double kilowatio;
        double kilowatioMes;
        double resultado;

        System.out.println("Ingrese el valor del kilowatio");
        kilowatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios consumidos");
        kilowatioMes = entrada.nextDouble();
        resultado = kilowatio * kilowatioMes;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $"
                + "%.0f ", n, c, resultado);
    }

    public static void calcularPredio(String n, String c) {
        double valorInmueble;
        double resultado;

        System.out.println("Ingrese el valor de inmueble");
        valorInmueble = entrada.nextDouble();
        resultado = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en %.2f y tiene que pagar de predio $ %.0f ", n, c,
                valorInmueble, resultado);
    }

}
