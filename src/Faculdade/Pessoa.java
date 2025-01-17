package Faculdade;

public class Pessoa {
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

    public Pessoa(String nome, String cpf, double peso, double altura) {//Pessoa com nome cpf peso e altura
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    //GET E SET
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}