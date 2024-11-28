//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number, horas;
        double salario;

        System.out.println("Informe o numero do funcionario: ");
        number = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("Salario: ");
        salario = sc.nextDouble();

        double salary;

        salary = horas * salario;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
