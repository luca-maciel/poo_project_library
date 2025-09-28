package org.example;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, int idade, String endereco, String telefone, String cpf, String rg, String cargo, double salario) {
        super(nome, idade, endereco, telefone, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo;}
    public void setCargo(String cargo) { this.cargo = cargo;}

    public double getSalario() { return salario;}

    public void setSalario(double salario) { this.salario = salario;}

    public void exibirInformacoes() {
        System.out.println("DADOS DO FUNCIONÁRIO");
        super.exibirDados();
        //System.out.println("Nome: " + getNome());
        //System.out.println("Idade: " + getIdade());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
        
    public double calcularBonus() {
        return salario * 0.10;
    }
}