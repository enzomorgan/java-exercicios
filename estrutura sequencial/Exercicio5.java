//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, num1, num2;
        double valor1, valor2;

        System.out.println("Codigo da peca 1: ");
        cod1 = sc.nextInt();
        System.out.println("Numero da peca 1: ");
        num1 = sc.nextInt();
        System.out.println("Valor da peca 1: ");
        valor1 = sc.nextDouble();

        System.out.println("Codigo da peca 2: ");
        cod2 = sc.nextInt();
        System.out.println("Numero da peca 2: ");
        num2 = sc.nextInt();
        System.out.println("Valor da peca 2: ");
        valor2 = sc.nextDouble();


        double total;

        total = valor1 * num1 + valor2 * num2;

        System.out.printf("VALOR TOTAL A PAGAR: %.2f%n", total);

        sc.close();
    }
}
