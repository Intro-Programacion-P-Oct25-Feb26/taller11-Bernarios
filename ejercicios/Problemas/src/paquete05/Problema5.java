/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] a = obtenersuma(informacion, informacion2);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%s\t", a[i][j]);
            }
            System.out.println();

        }

    }

    public static int[][] obtenersuma(int[][] a, int[][] b) {
        int[][] suma = new int[3][3];
        for (int l = 0; l < a.length; l++) {
            for (int m = 0; m < a[l].length; m++) {

                int x = a[l][m];
                int y = b[l][m];
                suma[l][m] = x + y;
            }

        }
        return suma;
    }

}
