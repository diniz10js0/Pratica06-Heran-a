public class Desempregado extends PessoaFisica {
    private double seguroDesemprego;

    // Construtor sem parâmetros, valor padrão para seguroDesemprego
    public Desempregado() {
        super(); // Chama o construtor sem parâmetros de PessoaFisica
        this.seguroDesemprego = 0.0;
    }

    // Construtor com parâmetros
    public Desempregado(String nome, String sobrenome, String cpf, double seguroDesemprego) {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }

    // Métodos de acesso 
    public double getSeguroDesemprego() {
        return seguroDesemprego;
    }

    // Métodos modificadores 
    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }

    // Método dados() que retorna os valores armazenados, sobrescrevendo o de PessoaFisica
    @Override
    public String dados() {
        return super.dados() + ", Seguro Desemprego: R$" + seguroDesemprego;
    }
}
