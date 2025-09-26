public class Biblioteca {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Guilherme");
        p1.setEndereco("Rua Jaime Pacheco, São Geraldo, N117 - Arcoverde, PE");
        p1.setTelefone("(87) 98877-6655");
        p1.setRg("PE-12.345.678");
        p1.setCpf("123.456.789-09");

        System.out.println("=== Pessoa 1 ===");
        p1.exibirDados();

    }
}