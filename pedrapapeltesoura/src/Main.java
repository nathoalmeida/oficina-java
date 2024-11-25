public class Main {
    public static void main(String[] args) {
        // Criando jogadores
        Jogador humano = new Jogador("Jogador Humano");
        Maquina maquina = new Maquina("Máquina");

        // Fazendo as jogadas
        humano.fazJogada();
        maquina.fazJogada();

        // Exibindo as jogadas
        System.out.println(humano.getNome() + " escolheu: " + humano.getJogada());
        System.out.println(maquina.getNome() + " escolheu: " + maquina.getJogada());

        // Exemplo de pontuação simples (opcional)
        if (humano.getJogada() == maquina.getJogada()) {
            System.out.println("Empate!");
        } else if ((humano.getJogada() == 0 && maquina.getJogada() == 2) ||
                   (humano.getJogada() == 1 && maquina.getJogada() == 0) ||
                   (humano.getJogada() == 2 && maquina.getJogada() == 1)) {
            System.out.println(humano.getNome() + " venceu!");
            humano.setPontos(humano.getPontos() + 1);
        } else {
            System.out.println(maquina.getNome() + " venceu!");
            maquina.setPontos(maquina.getPontos() + 1);
        }

        // Exibindo os pontos (opcional)
        System.out.println("Pontuação final:");
        System.out.println(humano.getNome() + ": " + humano.getPontos());
        System.out.println(maquina.getNome() + ": " + maquina.getPontos());
    }
}
