import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema folha de pagamentos");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o registro do colaborador: ");
        int registro = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tipo do colaborador: ");
        String tipo = scanner.nextLine();

        Colaborador colaborador = new Colaborador(registro, nome, tipo);

        System.out.println("Colaborador criado: " + colaborador.getNome());
        System.out.println("Tipo: " + colaborador.getTipo());
        System.out.println("Registro: " + colaborador.getRegistro());
    }
}
