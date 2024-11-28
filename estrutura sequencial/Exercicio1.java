//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("Informe dois valores: ");
        x = sc.nextInt();
        y = sc.nextInt();

        int soma;

        soma = x + y;

        System.out.println("Valor da soma: " + soma);

        sc.close();
    }
}