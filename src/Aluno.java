public class Aluno {
    private String nome;
    private int idade;

    public Aluno (){

    }

    public void exibirAluno(){
        System.out.println(getNome()+", "+getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  nome  +
                ", " + idade;
    }
}
