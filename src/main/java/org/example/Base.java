package org.example;

public abstract class Base {
    protected int id;
    protected boolean ativo = true;

    public void desativar(){
        ativo = false;
    }

    public void ativar(){ ativo = true; }

   public int getId(){
        return id;
    }

    public abstract void exibirInformacoes();
}