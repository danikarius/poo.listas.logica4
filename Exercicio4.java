package com.poo.listas.logica4.lista4;

import java.util.Scanner;

public class Exercicio4 {

    /*4) Escreva um código que irá percorrer uma lista de números inteiros
         lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
         números pares presente nela. */


         public static void resolucao(){
            Scanner leia = new Scanner(System.in);

            int lista[] = {3,5,6,7,8,10,22,55,110};
            int nPares = 0;

            for (int nPar : lista) {
                if (nPar % 2 == 0 ){
                nPares++;
                }
            }
            System.out.println("\n\n\n");
            System.out.println("Quais os números pares presentes na lista: {3,5,6,7,8,10,22,55,110}?");
            System.out.println("Presentes "+nPares+" números pares.");
            System.out.println("\n\n\n");
        }
}


