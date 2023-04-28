// Leia a idade de 20 pessoas e exiba a média das idades

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double media = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa: ");
            media = media + ler.nextInt();
        }
        System.out.println("A média das idades é: " + (media / 20));
        ler.close();
    }
}