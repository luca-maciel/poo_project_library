public class Usuario extends Pessoa{
    private String cadastro;
    private String datanascimento;
    private int livrosEmprestados;
    private boolean ativo;
    private String datacadastro;
    private int limitelivros;

    public Usuario() {
        super();
        this.livrosEmprestados = 0;
        this.limitelivros = 5;
        this.ativo = true;
    }

    public Usuario(String nome, String endereco, String telefone, String cpf, String rg, String cadastro, String datacadastro, String datanascimento, int limitelivros) {
        super(nome, endereco, telefone, cpf, rg);
        this.cadastro = cadastro;
        this.datanascimento = datanascimento;
        this.livrosEmprestados = 0;
        this.ativo = true;
        this.datacadastro = datacadastro;
        this.limitelivros = limitelivros;
    }

    public String getcadastro() {return cadastro;}
    public void setcadastro(String cadastro) {this.cadastro = cadastro;}

    public int getlivrosEmprestados() {return livrosEmprestados;}
    public void setlivrosEmprestados(int livrosEmprestados) {this.livrosEmprestados = livrosEmprestados;}

    public boolean isAtivo() {return ativo;}
    public void setAtivo(boolean ativo) {this.ativo = ativo;}

    public String getdatacadastro() {return datacadastro;}
    public void setdatacadastro(String datacadastro) {this.datacadastro = datacadastro;}

    public String getdatanascimento() {return datanascimento;}
    public void setdatanascimento(String datanascimento) {this.datanascimento = datanascimento;}
    
    public int getlimitelivros() {return limitelivros;}
    public void setlimitelivros(int limitelivros) {this.limitelivros = limitelivros;}

    public void emprestarlivro() {
        if(livrosEmprestados < limitelivros) {
        livrosEmprestados++; 
       } else {
        System.out.println("Limite de livros atingido.");
       }
    }

    public void devolverlivro() {
        if (livrosEmprestados > 0) livrosEmprestados--;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Data de nascimento: "+datanascimento);
        System.out.println("Cadastro: " +cadastro);
        System.out.println("Data de cadastro :" +datacadastro);
        System.out.println("Livros emprestados: "+livrosEmprestados);
        System.out.println("Limite de livros: "+limitelivros);
        if(ativo) {
            System.out.println("Status: Ativo");
        } else {
            System.out.println("Status: Inativo");
        }
    }

}
