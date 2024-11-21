import java.util.Scanner;

public class Jogador {

// ATRIBUTOS
    private String nome;
    private int jogada;
    private int pontos;


// CONSTRUTOR
    public Jogador(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

// MÉTODOS DA CLASSE
    public void fazJogada() {
        /* ATIVIDADE 1: Trate essa função para identificar
        *  quando o usuário inserir um número incompatível
        *  (diferente de 0,1 ou 2 */
        Scanner scan = new Scanner(System.in);
        jogada = scan.nextInt();
    }

// GETTERS E SETTERS
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getJogada() {
        return this.jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}
