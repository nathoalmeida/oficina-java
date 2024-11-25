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

    // M�TODOS DA CLASSE
    public void fazJogada() {
        Scanner scan = new Scanner(System.in);
        System.out.println(nome + ", insira sua jogada (0 - Pedra, 1 - Papel, 2 - Tesoura):");
        while (true) {
            try {
                jogada = scan.nextInt(); // L� o pr�ximo inteiro
                if (jogada >= 0 && jogada <= 2) {
                    break; // Sai do loop se a entrada for v�lida
                } else {
                    System.out.println("Entrada inv�lida. Digite 0, 1 ou 2.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inv�lida. Digite apenas n�meros.");
                scan.next(); // Limpa o buffer de entrada
            }
        }
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