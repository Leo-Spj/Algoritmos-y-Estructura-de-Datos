/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.algoritmos;

import org.example.algoritmos.Recursividad;

/**
 *
 * @author lsilvau
 */
public class Main_cOrdenamiento {

    public static void main(String[] args) {
        int n=10;
        Recursividad.cOrdenamiento oOrden=new Recursividad.cOrdenamiento(n);
        oOrden.llenaArreglo();
        System.out.println(oOrden.toString());
        //oOrden.burbuja_Intercambio();
        oOrden.insercion();
        System.out.println(oOrden.toString());
    }
}
