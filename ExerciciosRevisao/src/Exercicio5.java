// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int flag = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            double num = ler.nextDouble();
            if (num > 0 && num < 100) {
                flag++;
            }
        }
        System.out.println("Há " + flag + " número(s) entre 0 e 100. (ou seja, não incluindo 0 e 100)");
        ler.close();
    }
}