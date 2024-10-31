public class Main {
    public static void main(String[] args) {
        // Teste da classe PessoaFisica
        PessoaFisica pessoa = new PessoaFisica("João", "Silva", "123.456.789-00");
        System.out.println(pessoa.dados());

        // Teste da classe Desempregado
        Desempregado desempregado = new Desempregado("Maria", "Oliveira", "987.654.321-00", 1200.00);
        System.out.println(desempregado.dados());

        // Teste da classe Empregado
        Empregado empregado = new Empregado("Carlos", "Pereira", "555.555.555-55", 3500.00);
        System.out.println(empregado.dados());

        // Teste da classe Mensalista
        Mensalista mensalista = new Mensalista("Ana", "Souza", "111.222.333-44", 4000.00);
        System.out.println(mensalista.dados());
        
        // Outros testes para Comissionado, Horista e Tarefeiro podem ser realizados da mesma forma.
    }
}
