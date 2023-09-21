/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.clase03;

/**
 *
 * @author lsilvau
 */
public class Main_cOrdenamiento {

    public static void main(String[] args) {
        int n=10;
        cOrdenamiento oOrden=new cOrdenamiento(n);
        oOrden.llenaArreglo();
        System.out.println(oOrden.toString());
        //oOrden.burbuja_Intercambio();
        oOrden.insercion();
        System.out.println(oOrden.toString());
    }
}
