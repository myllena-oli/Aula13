// Exercício 3

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de identificação:");
        int id = ler.nextInt();
        System.out.println("Digite a primeira nota:");
        double nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota:");
        double nota2 = ler.nextInt();
        System.out.println("Digite a terceira nota:");
        double nota3 = ler.nextInt();

        double me = (nota1 + nota2 + nota3) / 3;
        double ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;

        System.out.println("O número do aluno é: " + id);
        System.out.println("Suas notas são:\nNota 1 = " + nota1 + "\nNota 2 = " + nota2 + "\nNota 3 = " + nota3);
        System.out.println("A média dos exercícios é: " + me);
        System.out.println("A média de aproveitamento é: " + ma);

        char conceito;
        if (ma >= 90) {
            conceito = 'A';
            System.out.println("Conceito: " + conceito);
        } else if (ma >= 75) {
            conceito = 'B';
            System.out.println("Conceito: " + conceito);
        } else if (ma >= 60) {
            conceito = 'C';
            System.out.println("Conceito: " + conceito);
        } else if (ma >= 40) {
            conceito = 'D';
            System.out.println("Conceito: " + conceito);
        } else {
            conceito = 'E';
            System.out.println("Conceito: " + conceito);
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }
        ler.close();
    }
}