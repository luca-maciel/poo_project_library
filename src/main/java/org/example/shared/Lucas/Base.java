package org.example.shared.Lucas;

public abstract class Base {
    protected int id;
    protected boolean ativo = true;

    public void desativar(){
        ativo = false;
    }

   public int getId(){
        return id;
    }

    public abstract void exibirInformacoes();
}
