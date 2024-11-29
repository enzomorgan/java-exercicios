//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("CODIGO   ESPECIFICAÇÃO     PREÇO");
        System.out.println("1        Cachorro Quente   R$4.00");
        System.out.println("2        X-Salada          R$4.50");
        System.out.println("3        X-Bacon           R$5.00");
        System.out.println("4        Torrada simples   R$4.00");
        System.out.println("5        Refrigerante      R$1.50");

        int menu, quantidade;

        System.out.println("Digite o codigo do pedido: ");
        menu = sc.nextInt();
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();

        double total = 0;

        switch (menu) {
            case 1:
            total = quantidade * 4.00;
            System.out.println("Quantidade de cachorro quente: " + quantidade);
            break;
        case 2:
            total = quantidade * 4.50;
            System.out.println("Quantidade de x-salada: " + quantidade);
            break;
        case 3:
            total = quantidade * 5.00;
            System.out.println("Quantidade de x-bacon: " + quantidade);
            break;
        case 4:
            total = quantidade * 4.00;
            System.out.println("Quantidade de torrada simples: " + quantidade);
            break;
        case 5:
            total = quantidade * 1.50;
            System.out.println("Quantidade de refrigerante: " + quantidade);
            break;
        default:
            System.out.println("Codigo invalido");
            break;
        }

        System.out.printf("Total: R$ %.2f%n", total);
		
    
        sc.close();
    }
}