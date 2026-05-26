package EstudoDeCaso1;

import java.util.Scanner;

public class Carro {
    String modelo;
    float velocidade, aceleracao;
    int marcha;


    void ligar() {
        System.out.println("Carro ligado");
    }

    void desligar() {
        System.out.println("Carro desligado");
    }

    void acelerar() {
        System.out.println("Carro acelerando");
    }

    void desacelerar() {
        System.out.println("carro desacelerando");
    }

    void direita() {
        System.out.println("virarando a direita");
    }

    void esquerda() {
        System.out.println("viraran a esqueda");
    }

    void marchaacima() {
        marcha++;
        System.out.println("marcha passada marcha para " + marcha);
    }

    void marchaabaixo() {
        marcha--;
        System.out.println("marcha reduzindo marcha para " + marcha);
    }



}


