///Mostre um menu com 2 opções e use if ou switch///
///para executar uma ação baseada na escolha do usuário.///

import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("======== MENU INTERATIVO ========");
            System.out.println("1. Iniciar Estrutura de Repetição");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("contando ate 10");
                    for (int i = 1; i < 11; i++){
                        System.out.println("Contando: " + i);
                    }return;
                case 2:
                    System.out.println("Saindo do menu interativo.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 2);
      scanner.close();   
    }  
}
