package Estudo;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Idade;
        System.out.println("Digite a sua idade: ");
        Idade = sc.nextInt();

        if(Idade>= 18){
            System.out.println("Voce pode tirar a carteira");
        }
        else{
            System.out.println("voce nao pode tirar a carteira");
        }
    }
}
