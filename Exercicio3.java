package com.poo.listas.logica4.lista4;

import java.util.Scanner;

public class Exercicio3 {

    /*3) Ainda utilizando o exercício do mercado, calcule o ticket médio de vendas do dia */

    
        public static void resolucao() {

        int nVendas;
        double soma = 0;
        Scanner leia = new Scanner(System.in);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("_____________________________________");
            System.out.print("\nBem-vindo ao sistema de vendas!\n");
            System.out.println("____________________________________");

            System.out.print("\nDigite quantas vendas foram realizadas hoje: ");
                nVendas = leia.nextInt();
            System.out.print("\n");
                double[] vendas = new double[nVendas];

            for (int i = 0 ; i < nVendas ; i++) {
            System.out.print("Digite o valor da " + (i+1) + " venda" + ": R$");
                vendas[i] = leia.nextDouble();
            
        }

        double maior = vendas[0];
        double menor = vendas[0];
    
            for (double venda : vendas) {
                soma += venda;    
                if (venda > maior) {
                  maior = venda;
                 }
                 if (venda < menor) {
                menor = venda;
                 }
             }       
       
        System.out.print("\nO total das vendas foi: R$" + soma + "\n");
        System.out.print("O maior valor de venda foi: R$" + maior + "\n");
        System.out.print("O menor valor de venda foi: R$" + menor + "\n");

        double tkmedio = (soma / nVendas);
        System.out.print("O ticket médio de vendas do dia foi: R$"+ tkmedio + "\n");

        System.out.print("\nPrograma encerrado!");
        System.out.println(".......................");
    }
}

