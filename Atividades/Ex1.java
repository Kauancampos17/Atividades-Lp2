package  Estudo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        System.out.println("Digite as suas horas de trabalho no mes: ");
        horas = sc.nextInt();
        System.out.println(("o tanto que voçe ganha no mes e " + horas * 20 + "R$"));

    }
}
