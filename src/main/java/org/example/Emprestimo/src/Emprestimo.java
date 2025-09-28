import java.time.LocalDate;

public class Emprestimo {

    private String tituloLivro;
    private int idLivro;
    private String userName;
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;


    public Emprestimo (String tituloLivro, int idLivro, String userName, LocalDate dataDeEmprestimo, LocalDate dataDeDevolucao, boolean devolvido){
        this.tituloLivro = tituloLivro;
        this.idLivro = idLivro;
        this.userName = userName;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;

    }


    public String getTituloLivro (){
        return tituloLivro;
    }

    public String getUserName(){
        return userName;
    }

    public LocalDate getDataDeEmprestimo(){
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo (LocalDate dataDeEmprestimo){
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public LocalDate getDataDeDevolucao(){
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao (LocalDate dataDeDevolucao){
        this.dataDeDevolucao = dataDeDevolucao;
    }


    public boolean isDevolvido (){
        return devolvido;
    }

    public void setDevolvido (boolean devolvido){
        this.devolvido = devolvido;
    }

    public void registroDeDevolucao(){
        if (this.devolvido = true){
            System.out.println("Livro devolvido com êxito.");
            this.dataDeDevolucao = LocalDate.now();
        }
    }

    public void statusEmprestimo(){
        if (this.isDevolvido()){
            System.out.println("Livro devolvido");
        }else if (LocalDate.now().isAfter(dataDeDevolucao)){
            System.out.println("Livro em atraso");
        } else {
            System.out.println("Livro em débito, prazo de entrega: " + dataDeDevolucao);
        }
    }

    public void status(){
        System.out.println("Título do livro: " + tituloLivro);
        System.out.println("ID: " + idLivro);
        System.out.println("Nome do usuário(a): " + userName);
        System.out.println("Data de empréstimo: " + dataDeEmprestimo);
        System.out.println("Data de devolução: " + dataDeDevolucao);
        System.out.println("Status do empréstimo: ");
        statusEmprestimo();
    }

}
