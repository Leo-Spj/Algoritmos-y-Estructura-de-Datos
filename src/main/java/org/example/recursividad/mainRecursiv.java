package org.example.recursividad;
public class mainRecursiv {

    public static void main(String[] args){

        Recursividad oRec ;

        int b[] = {10,5,3,5,};

        oRec = new Recursividad(b);

        System.out.println(oRec.sumador());
        System.out.println(oRec.sumadorPar());
        System.out.println(oRec.sumadorMenoresUltimo());
        //System.out.println(oRec.calculadorMenor());


    }
}
