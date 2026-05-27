public class Colaborador {
    private int registro;
    private String nome;
    private String tipo;

     public Colaborador(int registro, String nome, int tipo) {
        this.registro = registro;
        this.nome = nome;
        this.tipo = getTipoFromOpcao(tipo);
    }

    private String getTipoFromOpcao(int opcao) {
        switch (opcao) {
            case 1:
                return "Padrão";
            case 2:
                return "Comissionado";
            case 3:
                return "De Produção";
            default:
                return "Tipo Inválido";
        }
    }

    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getRegistro() {
        return registro;
    }
}
