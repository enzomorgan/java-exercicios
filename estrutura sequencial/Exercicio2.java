//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        double r, A;

        System.out.println("Informe o valor do raio: ");
        r = sc.nextDouble();

        A = pi * Math.pow(r, 2);

        System.out.printf("A: %.2f%n", A);

        sc.close();
    }
}
