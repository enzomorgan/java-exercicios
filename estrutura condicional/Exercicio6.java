//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();

        if(valor < 0.0 || valor > 100.0){
            System.out.println("Fora de intevalo");
        }

        else if(valor <= 25.0){
            System.out.println("Intevalo (00,25]");
        }

        else if(valor <= 50.0){
            System.out.println("Intevalo (25,50]");
        }

        else if(valor < 75.0){
            System.out.println("Intevalo (50,75]");
        }

        else{
            System.out.println("75, 100");
        }

        sc.close();
    }
}
