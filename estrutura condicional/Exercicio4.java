//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hora_inicial, hora_final;

        System.out.println("Hpra inicial: ");
        hora_inicial = sc.nextInt();
        System.out.println("Hora final: ");
        hora_final = sc.nextInt();

        int duracao;

        if(hora_inicial < hora_final){
            duracao = hora_final - hora_inicial;
        }
        else{
            duracao = 24 - hora_inicial + hora_final;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
