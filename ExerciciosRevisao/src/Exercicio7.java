// Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(nome);
        }
        ler.close();
    }
}