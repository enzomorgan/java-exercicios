//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double pi = 3.14159;

        System.out.println("Informe os valores de A, B e C: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double TRI, CIR, TRA, Q, R;

        TRI = A*C/2;
        CIR = pi*Math.pow(C,2);
        TRA = (A+B)*C/2;
        Q = Math.pow(B,2);
        R = A*B;

        System.out.printf("TRIANGULO: %.3f%n", TRI); //area do triangulo
        System.out.printf("CIRCULO: %.3f%n", CIR); //area do circulo
        System.out.printf("TRAPEZIO: %.3f%n", TRA); // area do trapezio
        System.out.printf("QUADRADO: %.3f%n", Q); //area do quadrado
        System.out.printf("RETANGULO: %.3f%n", R); //area do retangulo
        
        sc.close();
    }
}
