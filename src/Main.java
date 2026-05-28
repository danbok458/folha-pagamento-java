import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        double salarioBase = 2000.0;
        
        System.out.println("Sistema folha de pagamentos");

        Scanner scanner = new Scanner(System.in);
         ArrayList<Colaborador> colaboradores = new ArrayList<>();
        int opcao;

do {
    System.out.println("\n===== MENU =====");
    System.out.println("1 - Cadastrar colaborador");
    System.out.println("2 - Listar colaboradores");
    System.out.println("3 - Sair");
    System.out.print("Escolha uma opção: ");
    opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao) {
        case 1:
            System.out.println("Cadastrar colaborador");
            System.out.print("Digite o registro do colaborador: ");
        int registro = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tipo do colaborador: \n"); 

        System.out.println( "\n Tipos: \n 1 - padrão \n 2 - comissionado \n 3 - de produção");     

        int opcaoTipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        Colaborador colaborador = new Colaborador(registro, nome, opcaoTipo);

        if (opcaoTipo == 1) {
            // Lógica para colaborador padrão
        } else if (opcaoTipo == 2) {
            // Lógica para colaborador comissionado
        } else if (opcaoTipo == 3) {
            // Lógica para colaborador de produção
        }

        colaboradores.add(colaborador);
            
            break;

        case 2:
            System.out.println("Listar colaboradores");
            break;

        case 3:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida.");
            break;                
    }

} while (opcao != 3);

       
        

        for (Colaborador c : colaboradores) {
            System.out.println("Colaborador: " + c.getNome() + "\n" + "Tipo: " + c.getTipo() + "\n" + "Registro: " + c.getRegistro());
        }

         scanner.close();
    }
}
