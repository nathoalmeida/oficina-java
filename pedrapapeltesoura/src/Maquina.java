import java.util.Random;

public class Maquina extends Jogador {
    private int jogada;
    //construtor herdado de jogador

    public Maquina(String nome){
        super(nome);
    }

    // função de números aleatórios
    @Override
    public void fazJogada(){

        Random gerador = new Random();

        jogada = gerador.nextInt(3); //números de 0-2
    }
}
