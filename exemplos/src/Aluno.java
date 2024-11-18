public class Aluno {

    protected String nome;
    protected int codCurso;
    protected double saldoRU;
    protected boolean formando;

    // CONSTRUTOR
    public Aluno(String nome, int codCurso, double saldoRU, boolean formando) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.saldoRU = saldoRU;
        this.formando = formando;
    }

    public Aluno(String nome, int codCurso) {
        this.nome = nome;
        this.codCurso = codCurso;
    }

    public Aluno() {

    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public double getSaldoRU() {
        return saldoRU;
    }

    public boolean getFormando() {
        return formando;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public void setSaldoRU(double saldoRU) {
        this.saldoRU = saldoRU;
    }

    public void setFormando(boolean formando) {
        this.formando = formando;
    }

// OUTROS MÉTODOS

    public void almocaRU() {
        saldoRU = saldoRU - 2.5;
    }

    public void colocaSaldoRU(double valor) {
        saldoRU = saldoRU + valor;
    }

    public void colocaSaldoRU(Aluno aluno, double valor) {
        aluno.saldoRU = aluno.saldoRU + valor;
        this.saldoRU = this.saldoRU - valor;
    }

}
