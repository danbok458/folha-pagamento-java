import java.util.ArrayList;
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

        System.out.print("Digite o tipo do colaborador: \n"); 

        System.out.println( "\n Tipos: \n 1 - padrão \n 2 - comissionado \n 3 - de produção");

        String tipo = scanner.nextLine();

        Colaborador colaborador = new Colaborador(registro, nome, tipo);

       scanner.close();

        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        colaboradores.add(colaborador);

        for (Colaborador c : colaboradores) {
            System.out.println("Colaborador: " + c.getNome() + "\n" + "Tipo: " + c.getTipo() + "\n" + "Registro: " + c.getRegistro());
        }

    }
}
