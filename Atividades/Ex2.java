package Estudo;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Distancia;
        float PrecolLitro;
        float Total;

        System.out.println("Digite a distancia que voce tera de percorrer: ");
        Distancia = sc.nextInt();
        System.out.println("Qual o preco da gasolina: ");
        PrecolLitro = sc.nextFloat();
        Total = Distancia/12;

        System.out.println("o tanto de km que voce vai percorrer é" + Total + "km" + ". Dessa forma, voce vai desembolsar " + Total*PrecolLitro + "R$" );



    }

}
