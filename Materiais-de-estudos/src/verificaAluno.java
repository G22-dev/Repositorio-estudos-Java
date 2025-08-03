// ===============================================================
// Algoritmo para verificar se um aluno esta APROVADO ou REPROVADO
// ===============================================================

import java.util.Scanner;

public class verificaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;

        double nota2;

        try {

            System.out.println("========================");
            System.out.println("CALCULO MEDIA DE ALUNOS ");
            System.out.println("========================");

            System.out.println("Informe a primeira nota: ");
            nota1 = scanner.nextDouble();

            System.out.println("========================");
            System.out.println("Informe a segunda nota: ");
            nota2 = scanner.nextDouble();
            
        } catch (Exception e) {
            System.out.println("Por gentielza informar somente as notas dos alunos. ");
            scanner.close();
            return;
        }

        double media = (nota1 + nota2)/2;

        System.out.println("========================");
        System.out.println("Media do aluno: " + media);
        System.out.println("========================");

        if(media >= 7){
            System.out.println("O aluno foi aprovado.");
        }else{
            System.err.println("Aluno reprovado, fará prova de recuperação.");
        }
        System.out.println("========================");

        scanner.close();
    }

}