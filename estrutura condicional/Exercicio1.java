//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero inteiro: ");
        n = sc.nextInt();

        if(n > 0){
            System.out.println("NAO NEGATIVO");
        }
        else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}