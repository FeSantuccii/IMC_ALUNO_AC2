package Faculdade;

public class Funcoes {

    public static boolean verificarCpf(String cpf) {
        return cpf.matches("\\d{11}");
    }

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura); //calculo do imc
    }

    public static String avaliarAluno(Aluno aluno) { 
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) { //condição para presença de 75%
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
