package com.poo.listas.logica4.lista4;

import java.util.ArrayList;
import java.util.Scanner;

            /*7) Aproveite o código que estamos utilizando e implemente um preço
                 para cada item (Dica. Utilizem outra lista e use os mesmos índices para
                 o item e para o preço).*/

public class Exercicio7 {

    public static void resolucao() {
        
        ArrayList<String> listaPrecos = new ArrayList<>();
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
    
        int opcao = 0;
        
        while (opcao != 3) {
        
        System.out.println("\n_______________________Lista de Compras___________________ ***");
        System.out.println("1. Inserir itens");
        System.out.println("2. Ver a lista de compras");
        System.out.println("3. Remover item");
        System.out.println("4. Sair");
        System.out.print("Escolha a opção:");
        
        opcao = leia.nextInt();
        leia.nextLine();
    
         switch (opcao) {
            case 1:
               
                System.out.print("\nDigite o nome do item: ");
                String item = leia.nextLine();
                System.out.print("\nDigite o preço do item: ");
                String preco = leia.nextLine();
                listaCompras.add(item);
                listaPrecos.add(preco);
                System.out.println("\nItem '" + item + "' adicionado à lista.");
                break;
        
            case 2:
                
                System.out.println("\nLista de Compras:");
                
                if (listaCompras.isEmpty()) {
                    
                    System.out.println("\nA lista está vazia.\n");
                
                } else {
                    for (int i = 0; i < listaCompras.size(); i++) {
                        
                        System.out.println((i + 1) + ". " + listaCompras.get(i) + " R$ " + listaPrecos.get(i) );
                    }
                }
                break;
                
            case 3:
            
                if (listaCompras.isEmpty()) {
                    System.out.println("\nA lista está vazia.");
                } else {
                    System.out.println("\nDigite o número do item para remove-lo:");
                    
                    for (int i = 0; i < listaCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaCompras.get(i));
                    }
                    
                    int itemRemover = leia.nextInt();
                    
                    if (itemRemover > 0 && itemRemover <= listaCompras.size()) {
                        String removido = listaCompras.remove(itemRemover - 1);
                        System.out.println("Item '" + removido + "' removido da lista.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }
                break;
                
            case 4:
            
                System.out.println("Saindo...\n");
                break;
    
            default:
                System.out.println("\nOpção inválida, tente novamente.");
                }
            }
        }
    }

