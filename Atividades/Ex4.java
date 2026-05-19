package Estudo;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Graus;
        System.out.println("em quantos graus esta sua febre? ");
        Graus = sc.nextInt();

        if(Graus >= 37)
        {
            System.out.println("voce esta com febre");
        }
        else{
            System.out.println("voce esta normal");
        }

    }
}
