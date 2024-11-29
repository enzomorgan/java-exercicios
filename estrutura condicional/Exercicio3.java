//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite os valores de A e B: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A%B==0 || B%A==0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
