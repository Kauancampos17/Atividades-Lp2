package Estudo;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ValorHora, HorasTrabalhadas, Inss, SalarioBruto, TotalInss, Total;

        System.out.println("ola, qual o valor da sua hora de trabalho");
        ValorHora = sc.nextInt();
        System.out.println("quantas horas voce trabalha no dia: ");
        HorasTrabalhadas = sc.nextInt();
        System.out.println("qual o seu desconto do inss");
        Inss = sc.nextInt();

        SalarioBruto = HorasTrabalhadas * 30 * ValorHora;
        TotalInss = SalarioBruto * Inss / 100;
        Total = SalarioBruto - TotalInss;

        System.out.println("seu salario e " + Total + "R$");


    }


}