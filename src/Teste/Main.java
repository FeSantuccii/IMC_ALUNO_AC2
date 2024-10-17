package Teste;

import Faculdade.Aluno;
import Faculdade.Pessoa;
import Faculdade.Funcoes;

public class Main {
    public static void main(String[] args) {
        //Testando as classes
        Pessoa pessoa = new Pessoa("Felipe", "12345678901", 70.0, 1.75);
        Aluno aluno = new Aluno("João", "10987654321", 60.0, 1.65, 8.5, 80.0);

        //Verificando CPF
        System.out.println("CPF da pessoa: " + Funcoes.verificarCpf(pessoa.getCpf()));
        System.out.println("CPF do aluno: " + Funcoes.verificarCpf(aluno.getCpf()));

        //Calculando IMC
        double imcMaria = Funcoes.calcularImc(aluno.getPeso(), aluno.getAltura());
        System.out.printf("IMC de %s: %.2f%n", aluno.getNome(), imcMaria);

        //Avaliando o aluno
        String resultado = Funcoes.avaliarAluno(aluno);
        System.out.println("Resultado da avaliação de " + aluno.getNome() + ": " + resultado);
    }
}