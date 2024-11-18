public class Bolsista extends Aluno {

    int numBeneficio;
    double valorBolsa;


    public Bolsista(String nome, int codCurso, int numBeneficio, double valorBolsa) {
        super(nome, codCurso);
        this.numBeneficio = numBeneficio;
        this.valorBolsa = valorBolsa;
    }

    @Override
    public void almocaRU() {
        saldoRU = saldoRU - 2.75;
    }
}
