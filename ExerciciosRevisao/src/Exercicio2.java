// Faça um algoritmo que leia uma variável e some 5 caso seja par ou
//some 8 caso seja ímpar, imprimir o resultado desta operação.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int x = ler.nextInt();

        if (x % 2 == 0) {
            x = x + 5;
            System.out.printf("O número é par, então o resultado é: " + x);

        } else {
            x = x + 8;
            System.out.printf("O número é ímpar, então o resultado é: " + x);
        }
        ler.close();
    }
}