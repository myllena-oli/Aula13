// Leia um conjunto de salários, sendo que para terminar a entrada será
//fornecido o valor -1. Após toda a entrada ter sido realizada, leia o valor
//de um reajuste. Em seguida exiba todos os salários já reajustados.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        double num = 0;
        Scanner ler = new Scanner(System.in);
        List<Double> salarios = new ArrayList<>();
        System.out.println("Digite os salários. Para parar digite -1: ");

        while (true) {
            num = ler.nextDouble();
            if (num == -1) {
                break;
            }
            salarios.add(num);
        }
        System.out.println("Digite quantos porcento de ajuste: ");
        double reajuste = ler.nextDouble();

        for (int i = 0; i < salarios.size(); i++) {
            System.out.println(salarios.get(i) + (salarios.get(i) * reajuste / 100));
        }
        ler.close();
    }
}