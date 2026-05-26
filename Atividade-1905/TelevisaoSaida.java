package EstudoDeCaso1;

public class TelevisaoSaida {
    public static void main(String[] args){
        Televisao tv1 = new Televisao();
        tv1.tamanhoTela = 50;
        tv1.volume = 17;
        tv1.marca = "LG";
        tv1.canal = 10;

        tv1.ligar();
        tv1.aumentarVolume();
        tv1.descerCanal();
        tv1.subirCanal();
        tv1.desligar();


    }
}
