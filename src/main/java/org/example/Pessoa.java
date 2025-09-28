package org.example;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String rg;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String endereco, String telefone, String cpf, String rg) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}