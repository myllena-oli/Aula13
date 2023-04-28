// Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses
// números. Encerre a execução quando um número negativo for digitado.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double num = 0, soma = 0;

        System.out.println("Digite uma sequência de números para soma. Para parar, digite um número negativo (ele não será considerado): ");

        while (num>=0) {
            num = ler.nextDouble();
            soma = soma + num;
        }
        soma = soma-num;
        System.out.println("A soma é: " +soma);
        ler.close();
    }
}