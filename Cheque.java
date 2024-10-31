public class Cheque extends Pagamento {
    private String numeroDoCheque;

    // Construtor
    public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
    }

    // Métodos de acesso (Getter)
    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    // Métodos modificadores (Setter)
    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }
}
