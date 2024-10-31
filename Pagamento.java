public class Pagamento {
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    // Construtor
    public Pagamento(String nomeDoPagador, String cpf, double valorASerPago) {
        this.nomeDoPagador = nomeDoPagador;
        this.cpf = cpf;
        this.valorASerPago = valorASerPago;
    }

    // Métodos de acesso (Getters)
    public String getNomeDoPagador() {
        return nomeDoPagador;
    }

    public String getCpf() {
        return cpf;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    // Métodos modificadores (Setters)
    public void setNomeDoPagador(String nomeDoPagador) {
        this.nomeDoPagador = nomeDoPagador;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
}

