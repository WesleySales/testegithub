//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Joao");
        aluno1.setIdade(18);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ingrid");
        aluno2.setIdade(19);

        System.out.println(aluno1);
        System.out.println(aluno2);

    }
}