package Estudo;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float Peso, Altura = 0, Total;
        System.out.println("Vamos medir o seu IMC, mas primeiro precisamos do seu peso: ");
        Peso = sc.nextFloat();
        System.out.println("agoraeu quero sua altura");

        Total = Peso / Altura * Altura;

        if(Total >= 30){
            System.out.println("voce esta obeso");
        }
        else{
            System.out.println("voce nao esta obeso");
        }




    }

}
