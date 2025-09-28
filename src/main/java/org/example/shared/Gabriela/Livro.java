package org.example.shared.Gabriela;

import org.example.shared.Lucas.Base;

public class Livro extends Base {
    private String titulo;
    private int idAutor;
    private boolean disponivel;
    private static int contadorLivros = 0;

    public Livro(String titulo, int idAutor) {
        this.titulo = titulo;
        this.idAutor = idAutor;
        this.disponivel = true;
        contadorLivros++;
        this.id = contadorLivros;
    }

    public Livro() {
        this("LIVRO SEM TÍTULO", 0);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestarLivro() {
        disponivel = false;
    }

    public void devolverLivro() {
        disponivel = true;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("INFORMAÇÕES DO LIVRO");
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor ID: " + idAutor);
        System.out.println("Disponível: " + (disponivel ? "SIM" : "NÃO"));
    }
}
