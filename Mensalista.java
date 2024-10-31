public class Mensalista extends Empregado {
    private double salarioMensal;

    // Construtor sem parâmetros
    public Mensalista() {
        super();
        this.salarioMensal = 0.0;
    }

    // Construtor com parâmetros
    public Mensalista(String nome, String sobrenome, String cpf, double salarioMensal) {
        super(nome, sobrenome, cpf, salarioMensal);
        this.salarioMensal = salarioMensal;
    }

    // Métodos de acesso 
    public double getSalarioMensal() {
        return salarioMensal;
    }

    // Métodos modificadores 
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    // Método dados() que retorna os valores armazenados
    @Override
    public String dados() {
        return super.dados() + ", Salário Mensal: R$" + salarioMensal;
    }
}
