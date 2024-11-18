//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Aluno al1 = new Aluno();
       al1.setNome("Nathália");

       System.out.println(al1.getNome());

       Bolsista bol1 = new Bolsista("Fulano", 314, 21, 700.0);

        System.out.println(bol1.getNome());
        al1.colocaSaldoRU(20.0);
        al1.colocaSaldoRU(bol1, 2.75);

        System.out.println(bol1.getSaldoRU());
        System.out.println(al1.getSaldoRU());
    }
}