// Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá
// se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos
// deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int a = ler.nextInt();
        System.out.println("Digite um valor inteiro:");
        int b = ler.nextInt();

        if (a == b) {
            int c = a + b;
            System.out.printf("Os valores são iguais então o resultado é: " + c);

        } else {
            int c = a * b;
            System.out.printf("Os valores são diferentes então o resultado é: " + c);
        }
        ler.close();
    }
}