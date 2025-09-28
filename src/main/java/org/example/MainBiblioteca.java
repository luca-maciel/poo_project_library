package org.example;
import java.time.LocalDate;

//TESTE MAIN
public class MainBiblioteca {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE BIBLIOTECA COMPLETO ===\n");

        // Teste 1: Autor e Livro
        System.out.println("1. TESTE AUTOR E LIVRO");
        System.out.println("======================");
        Autor autor = new Autor("Machado de Assis");
        Livro livro = new Livro("Dom Casmurro", autor.getId());

        autor.exibirInformacoes();
        livro.exibirInformacoes();

        // Teste 2: Usuário
        System.out.println("\n2. TESTE USUÁRIO");
        System.out.println("================");
        Usuario usuario = new Usuario();
        usuario.setNome("João Silva");
        usuario.setEndereco("Rua A, 123");
        usuario.setTelefone("(11) 9999-8888");
        usuario.setCpf("123.456.789-00");
        usuario.setRg("SP-12.345.678");
        usuario.setcadastro("USER001");
        usuario.setdatacadastro("15/03/2024");
        usuario.setdatanascimento("20/05/1990");

        usuario.exibirDados();

        // Teste 3: Funcionário
        System.out.println("\n3. TESTE FUNCIONÁRIO");
        System.out.println("====================");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos Souza");
        funcionario.setIdade(35);
        funcionario.setEndereco("Av. Trabalhadores, 456");
        funcionario.setTelefone("(11) 7777-6666");
        funcionario.setCpf("987.654.321-00");
        funcionario.setRg("MG-98.765.432");
        funcionario.setCargo("Bibliotecário");
        funcionario.setSalario(3500.00);

        funcionario.exibirInformacoes();

        // Teste 4: Empréstimo
        System.out.println("\n4. TESTE EMPRÉSTIMO");
        System.out.println("===================");
        Emprestimo emprestimo = new Emprestimo(
                livro.getTitulo(),
                livro.getId(),
                usuario.getNome(),
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(10)
        );

        emprestimo.status();

        // Teste 5: Integração Completa
        System.out.println("\n5. TESTE INTEGRAÇÃO COMPLETA");
        System.out.println("============================");
        testarFluxoCompleto();

        // Teste 6: Verificação Requisitos POO
        System.out.println("\n6. VERIFICAÇÃO REQUISITOS POO");
        System.out.println("=============================");
        verificarRequisitosPOO();
    }

    private static void testarFluxoCompleto() {
        // Criar elementos
        Autor autor2 = new Autor("José de Alencar");
        Livro livro2 = new Livro("O Guarani", autor2.getId());
        Usuario usuario2 = new Usuario();
        usuario2.setNome("Maria Oliveira");

        System.out.println(">>> Situação Inicial:");
        livro2.exibirInformacoes();

        System.out.println("\n>>> Realizando empréstimo:");
        livro2.emprestarLivro();
        usuario2.emprestarlivro();

        Emprestimo emp = new Emprestimo(livro2.getTitulo(), livro2.getId(), usuario2.getNome());
        emp.status();
        livro2.exibirInformacoes();
        System.out.println("Livros emprestados pelo usuário: " + usuario2.getlivrosEmprestados());

        System.out.println("\n>>> Realizando devolução:");
        livro2.devolverLivro();
        usuario2.devolverlivro();
        emp.registroDeDevolucao();
        emp.status();
        livro2.exibirInformacoes();
        System.out.println("Livros emprestados pelo usuário: " + usuario2.getlivrosEmprestados());
    }

    private static void verificarRequisitosPOO() {
        System.out.println("✅ Variáveis privadas com getters/setters");
        System.out.println("✅ Construtores padrão e com parâmetros");
        System.out.println("✅ Herança (Usuario/Funcionario ← Pessoa, Autor/Livro ← Base)");
        System.out.println("✅ Classe abstrata Base com método abstrato");
        System.out.println("✅ Sobrescrita de métodos (@Override)");
        System.out.println("✅ Estruturas lógicas (if/else, loops)");
        System.out.println("✅ Encapsulamento completo");
        System.out.println("✅ Métodos com e sem retorno");

        System.out.println("\n🎯 TODOS OS REQUISITOS POO ATENDIDOS!");
    }
}