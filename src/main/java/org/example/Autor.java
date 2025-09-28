package org.example;

public class Autor extends Base {
    private String nome;
    private static int contadorAutores = 0;

    public Autor(String nome){
        this.nome = nome;
        contadorAutores++;
        this.id = contadorAutores;
    }

    public Autor() {
        this("AUTOR DESCONHECIDO");
    }

    public String getNome(){
        return nome;
    }

    /*int getAuthorId(){
        return this.id;
    }*/

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("INFORMAÇÕES DO AUTOR");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Ativo: " + (ativo ? "SIM" : "NÃO"));

    }

}