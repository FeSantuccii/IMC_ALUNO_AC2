package Faculdade;

public class Aluno extends Pessoa { //TEM DE HERANÇA A PESSOA
    private double nota;
    private double percentualPresenca;

    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura); //SUPERCLASSE PESO
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // GET E SET
    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }
}