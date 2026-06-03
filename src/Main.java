import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
       final double salarioBase = 2000.0; //base salarial
       
        System.out.println("Sistema folha de pagamentos");

        Scanner scanner = new Scanner(System.in);
         ArrayList<Colaborador> colaboradores = new ArrayList<>();
        int opcao;

do {
    System.out.println("\n===== MENU =====");
    System.out.println("1 - Cadastrar colaborador");
    System.out.println("2 - Listar colaboradores");
    System.out.println("3 - Sair");
    System.out.println("================");
    System.out.print("Escolha uma opção: ");
    opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao) {
        case 1:
            System.out.println("Cadastrar colaborador");
            System.out.print("\n" + "Digite o registro do colaborador: ");
            int registro = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

        System.out.print("\n" + "Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("\n" + "Digite o tipo do colaborador: \n"); 

        System.out.println( "\n Tipos: \n 1 - padrão \n 2 - comissionado \n 3 - de produção");     

        int opcaoTipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        Colaborador colaborador = new Colaborador(registro, nome, opcaoTipo);

        if (opcaoTipo == 1) {
            System.out.println("Colaborador padrão salvo com sucesso. \n" + "\n Salário: " + salarioBase);
        
        } else if (opcaoTipo == 2) {
            System.out.println("Qual o valor das vendas do colaborador comissionado? ");
            double vendas = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Qual o percentual de comissão do colaborador comissionado? ");
            double percentual = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Colaborador comissionado salvo com sucesso. \n Salário: " + (salarioBase + (vendas * percentual / 100)));
        
        } else if (opcaoTipo == 3) {
            System.out.println("Número de peças produzidas pelo colaborador de produção: ");
            int pecasProduzidas = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Qual o valor pago por peça produzida?");
            double valorPorPeca = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Colaborador de produção salvo com sucesso. \n Salário: " + (salarioBase + (pecasProduzidas * valorPorPeca)));
        }

        if (opcaoTipo < 1 || opcaoTipo > 3) {
    System.out.println("Tipo de colaborador inválido. Colaborador não cadastrado.");
} else {
    colaboradores.add(colaborador);
}
            break;

        case 2:
            System.out.println("Listar colaboradores");
            System.out.println("Colaboradores cadastrados: " + colaboradores.size() + "\n");
            colaboradores.forEach(c -> System.out.println("-----------------------------" + "\n" + "Colaborador: " + c.getNome() + "\n" + "Tipo: " + c.getTipo() + "\n" + "Registro: " + c.getRegistro() + "\n" + "-----------------------------"));
            break;

        case 3:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida.");
          break;               
    }

} while (opcao != 3);

         scanner.close();
    }
}
