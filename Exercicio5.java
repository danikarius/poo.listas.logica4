package com.poo.listas.logica4.lista4;

import java.util.ArrayList;
import java.util.Scanner;



        /*5) Escreva um programa que sirva como uma lista de compras de
             mercado. Você irá criar um menu que pergunte se o usuário quer inserir
             um item ou ver a lista. */

             public class Exercicio5 {

                public static void resolucao() {
                
                    ArrayList<String> listaCompras = new ArrayList<>();
                    Scanner leia = new Scanner(System.in);
        
                    int opcao = 0;
        
            
                    while (opcao != 3) {
                    
                    System.out.println("\n***____________ LISTA DE COMPRAS_______________");
                    System.out.println("1. Inserir itens");
                    System.out.println("2. Ver a lista de compras");
                    System.out.println("3. Sair");
                    System.out.print("Escolha a opção: ");
                    
                    opcao = leia.nextInt();
                    leia.nextLine(); 
        
                    switch (opcao) {
                        case 1:
                           
                            System.out.print("\nDigite o nome do item: ");
                            String item = leia.nextLine();
                            listaCompras.add(item);
                            System.out.println("\nItem '" + item + "' adicionado à lista.");
                            break;
                        
                    
                        case 2:
                            
                            System.out.println("\nLista de Compras: ");
                            
                            if (listaCompras.isEmpty()) {
                                
                                System.out.println("\nA lista está vazia.\n");
                            
                            } else {
                                for (int i = 0; i < listaCompras.size(); i++) {
                                    
                                    System.out.println((i + 1) + ". " + listaCompras.get(i));
                                }
                            }
                            break;
                        
                        
                        case 3:
                            
                            System.out.println("Saindo...\n");
                            break;
                        default:
                            
                            System.out.println("\nOpção inválida, tente novamente.");
                    }
                }
            }
        }