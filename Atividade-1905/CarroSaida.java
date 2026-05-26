package EstudoDeCaso1;

public class CarroSaida {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Sedan";
        carro1.velocidade = 148.0f;
        carro1.aceleracao = 15.0f;
        carro1.marcha = 4;

        System.out.println("Modelo " + carro1.modelo);
        System.out.println("Velocidade " + carro1.velocidade);
        System.out.println("Aceleraçao " + carro1.aceleracao);
        System.out.println("marcha " + carro1.marcha);

        carro1.ligar();
        if (carro1.aceleracao > 0) {
            carro1.acelerar();
        } else {
            carro1.desacelerar();
        }
        carro1.esquerda();
        carro1.direita();
        carro1.marchaacima();
        carro1.marchaabaixo();
        carro1.desligar();

    }
}
