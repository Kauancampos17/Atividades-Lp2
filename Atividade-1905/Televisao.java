package EstudoDeCaso1;

public class Televisao {
    public int tamanhoTela;
    public int volume;
    public int voltagem;
    public String marca;
    public int canal;

    void ligar(){
        int consumoEnergia = voltagem * tamanhoTela;
        System.out.println("Televisao ligada com consumo de " + consumoEnergia);
    }
    void desligar(){
        System.out.println("Televisao desligada");
    }
    void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentada para " + volume);
    }
    void abaixarvolume() {
        volume--;
        System.out.println("volume abaixado para " + volume);
    }
    void subirCanal(){
        canal++;
        System.out.println("canal subido para " + canal);
    }
    void descerCanal(){
        canal--;
        System.out.println("canal abaixado para " + canal);
    }
}


